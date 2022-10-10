package com.gonzaga;

import java.time.LocalDate;

public class testApplication {
    public static void main(String[] args) {


        Assinatura assinatura = new Assinatura();
        assinatura.setDescricao("Assinatuta MVP");
        assinatura.setCodigo(123);
        assinatura.setPreco(69.90);
        assinatura.setDataExpiracao(LocalDate.parse("2023-12-01"));

        Programa programa = new Programa();
        programa.exibirDiasAteExpirar(assinatura);
    }
}