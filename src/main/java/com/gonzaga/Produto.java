package com.gonzaga;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Produto {

    private int codigo;
    private String descricao;
    private double preco;

}
