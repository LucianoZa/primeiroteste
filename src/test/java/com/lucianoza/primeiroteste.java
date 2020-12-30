package com.lucianoza;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class primeiroteste {

    @Test
    public void estruturaDeUmTeste() {
    //cenário
    int numero1 = 10;
    int numero2 = 5;

    //execução
    int resultado = numero1 + numero2;

    //verificações por assertivas
        //              esperado, resultado para comparação
        //Assert.assertEquals(14, resultado);

        //               que resultado = 15
        Assertions.assertThat(resultado).isEqualTo(15);



    }
}
