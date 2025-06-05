package com.example.avaliacao.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Criptomoeda {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true)
    @NotNull(message = "É obrigatório ter id")
    private Long id;

    @NotNull(message = "É obrigatório ter nome")
    @Size(min = 3, max = 100)
    private String nome;

    @NotNull(message = "É obrigatorio ter a sigla")
    @Size(min = 3, max = 3)
    private String sigla;

    @NotNull(message = "É obrigatório ter preço")
    @Positive(message = "O preço deve ser um número maior que 0")
    private double precoAtual;

    @NotNull(message = "É obrigatório ter preço")
    @Positive(message = "O preço deve ser um número maior ou igual a 0")
    private double volumeNegociado;

    @NotNull(message = "Data obrigatória")
    @PositiveOrZero(message = "A data não pode ser futura")
    private LocalDate dataCadastro;


    @NotNull(message = "É obrigatório a moeda estar ativa")
    private boolean ativo;


    @Size(min = 2, max = 60)
    private String descricao;


    @NotNull(message = "O país é obrigatório")
    @Size(min = 2, max = 60)
    private String pais;

    private String siteOficial;


}
    

