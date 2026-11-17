package com.estudos.primeiraapi.controller;

import org.springframework.web.bind.annotation.*;
import com.estudos.primeiraapi.model.*;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {


    @GetMapping("/{id}")
    public String consulta (@PathVariable int id) {
        return "Produto consultado: " + id;
    }

    @GetMapping("/pesquisar")
    public String pesquisarPorCategoria (@RequestParam String categoria) {
        return "Pesquisando categoria: " + categoria;
    }

    @GetMapping("/detalhes")
    public Produto detalhes() {
        return new Produto(1, "mouse gamer", 150.0);
    }

    @PostMapping
    public String cadastrar (@RequestBody Produto produto) {
        return "Produto recebido: " + produto.getNome();
    }

}