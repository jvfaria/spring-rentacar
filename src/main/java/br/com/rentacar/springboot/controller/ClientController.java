package br.com.rentacar.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/clients")
    public String testMapping() {
        return "ok";
    }
}
