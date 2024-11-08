package com.fiap.cp.cp3_api.service;

import org.springframework.stereotype.Service;

@Service
public class HammingDistanceService {

    public int calculateHammingDistance(String seq1, String seq2) {
        if (seq1.length() != seq2.length()) {
            throw new IllegalArgumentException("Sequências devem ter o mesmo comprimento.");
        }

        int distance = 0;
        for (int i = 0; i < seq1.length(); i++) {
            if (seq1.charAt(i) != seq2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
    
}