package br.com.fiap.twoespwx.libunclealegnment.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/alignment")
public class AlignmentController {
    
    @GetMapping("/")
    public String home() {
        return "/v1/alignment/home";
    }

    @PostMapping("/distance")
    public Double distance(@RequestBody String input) {
        System.out.println(input);
        Double pi = 3.14;
        return pi;
    }
    
}
