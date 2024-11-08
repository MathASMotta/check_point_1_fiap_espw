package com.fiap.cp.cp3_api.controller;

import com.fiap.cp.cp3_api.model.*;
import com.fiap.cp.cp3_api.service.HammingDistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/v1/alignment")
public class AlignmentController {

    @Autowired
    private HammingDistanceService hammingDistanceService;

    @PostMapping("/distance")
    public AlignmentResponse calculateDistance(@RequestBody AlignmentRequest request) {
        SequenceRequest seq1 = request.getSequences().get(0);
        SequenceRequest seq2 = request.getSequences().get(1);
        
        int hammingDistance = hammingDistanceService.calculateHammingDistance(seq1.getSequence(), seq2.getSequence());
        double similarityScore = 1 - (hammingDistance / (double) seq1.getSequence().length());

        // Criação da resposta
        AlignmentResponse response = new AlignmentResponse();
        response.setTracing_id(request.getTracing_uuid());
        response.setAlignment_uuid(UUID.randomUUID().toString());

        MethodDetails methodDetails = new MethodDetails();
        response.setMethod(methodDetails);

        Result result = new Result();
        result.setDistance_score(hammingDistance);
        result.setSimilarity_score(similarityScore);
        result.setLength(seq1.getSequence().length());
        result.setFormat(request.getFormat());
        result.setProcessing_time(0.005); // Exemplo de tempo de processamento
        result.setCreated_at(LocalDateTime.now());
        result.setStatus("PROCESSED");
        response.setResult(result);

        response.setStatus("PROCESSED");
        response.setCreated_at(LocalDateTime.now());
        response.setUpdated_at(LocalDateTime.now());

        return response;
    }
}
