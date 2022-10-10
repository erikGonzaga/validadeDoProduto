package com.gonzaga;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;


    /*
    A herança em Java é representada pela palavra-chave extends na declaração da classe,
    seguida do nome da classe da qual se deseja herdar. Nesse caso, Assinatura herda de Produto;
    */

    /*
    dataExpiracao, bem como os getters e setters que permitem acessar esse atributo;
    aqui implementados atraves de @Getter e @Setter do biblioteca Lombok
    */

@Getter @Setter
public class Assinatura extends Produto
        implements Expiravel {

    private LocalDate dataExpiracao;

    /*
    Period, classe nativa do Java que representa um intervalo de tempo
    (nesse caso o tempo que falta até a assinatura expirar);
     */

    @Override       // Aqui sobrescrevo a regra;
    public Period   calculaAteExpiracao() {
        return Period.between(dataExpiracao, LocalDate.now());
    }

}