package com.example.avaliacao.service;

import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.repository.CriptoRepository;

import java.util.List;
import java.util.Optional;

public class CriptoService {


    private CriptoRepository criptoRepository;

    public Criptomoeda salverCrypto(Criptomoeda produto) {
        return criptoRepository.save(produto);
    }

    public Criptomoeda buscarCriptoPorId(Long id) {
        return criptoRepository.findById(id).get();
    }

    public List<Criptomoeda> buscarTodosAsCriptos() {
        return criptoRepository.findAll();
    }

    public Criptomoeda editar(Criptomoeda criptomoeda) {
        return criptoRepository.save(criptomoeda);
    }

    public void excluir(Long id) {
        criptoRepository.deleteById(id);
    }

    public Optional<Criptomoeda> buscarPorId(Long id) {
        return criptoRepository.findById(id);
    }
}
