package com.lucianoza;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class primeiroteste {

    @Test
    public void TestDeveSomar2Numeros() {
    //cenário
    int numero1 = 10;
    int numero2 = 5;

    //execução
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(numero1, numero2);

    //verificações por assertivas
        //              esperado, resultado para comparação
        //Assert.assertEquals(14, resultado);

        //               que resultado = 15
        Assertions.assertThat(resultado).isEqualTo(15);
    }
}

class Calculadora{
    int somar(int num, int num2) {
        return num + num2;
    }
}