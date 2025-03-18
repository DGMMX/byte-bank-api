package br.com.fiap.byte_bank_api.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GeneralController {
    @GetMapping("/")
    public String index(){ 
        return "Projeto: ByteBank. \nNome: Diego Bassalo Canals Silva RM 558710";
    }
}
