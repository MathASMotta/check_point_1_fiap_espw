package br.com.fiap.twoespwx.libunclealegnment.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class HomeController {
    
    @GetMapping("/health")
    public String health() {
        return "up";
    }
}
