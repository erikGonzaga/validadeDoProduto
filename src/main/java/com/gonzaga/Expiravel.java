package com.gonzaga;

import java.time.Period;

/*
Em uma interface todos os métodos são públicos,
portanto é comum omitirmos o modificador de acesso public.
Tais métodos também são abstratos e sua implementação fica
por conta da classe que implementa a interface.
 */

public interface Expiravel {

    // Aqui eu tenho uma regra;
    Period calculaAteExpiracao();
}
