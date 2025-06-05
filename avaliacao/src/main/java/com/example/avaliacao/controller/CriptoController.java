package com.example.avaliacao.controller;

import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.service.CriptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class CriptoController {

    @Autowired
    private CriptoService criptoService;

    @PostMapping
    public Criptomoeda salvaCripto(@RequestBody Criptomoeda criptomoeda) {
        return criptoService.salverCrypto(criptomoeda);
    }

    @GetMapping("{id}")
    public Criptomoeda buscaCriptoPorId(@PathVariable Long cripto) {
        return criptoService.buscarCriptoPorId(cripto);
    }

    @GetMapping
    public List<Criptomoeda> listarCriptos() {
        return criptoService.buscarTodosAsCriptos();
    }


    @PutMapping("{id}")
    public String editaCripto(@PathVariable Long id, @RequestBody Criptomoeda criptomoeda) {
        Optional<Criptomoeda> criptomoedaAtual = criptoService.buscarPorId(id);
        if (criptomoedaAtual.isEmpty()) {
            return "Cripto com id " + id + " não encontrado";
        }
        criptomoeda.setId(criptomoedaAtual.get().getId());
        criptoService.editar(criptomoeda);
        return "Cripto atualizada com sucesso";
    }

    @DeleteMapping("{id}")
    public String deletarCripto(@PathVariable Long id) {
        criptoService.excluir(id);
        return "Cripto deletada com sucesso";
    }


}

