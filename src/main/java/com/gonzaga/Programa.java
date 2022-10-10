package com.gonzaga;

import java.time.Period;

public class Programa {

    public void exibirDiasAteExpirar(Expiravel expiravel){

        Period tempoRestante = Period.of(expiravel.calculaAteExpiracao().getYears(),
                expiravel.calculaAteExpiracao().getMonths(),
                expiravel.calculaAteExpiracao().getDays());

        System.out.println("Tempo restante: " + tempoRestante);
    }
}
