package com.steps.features;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class contadorIncrementaValor {
    private int contador=0;
    @Dado("que o valor é {int}")
    public void que_o_valor_é(Integer int1) {
    contador=int1;
    }

    @Quando("eu incremento mais {int}")
    public void eu_incremento_mais(Integer int1) {
        contador=contador+int1;
    }

    @Então("o valor total será {int}")
    public void o_valor_total_será(Integer int1) {
    System.out.println("O valor total do incremento é: " + int1);
    System.out.println("O valor do contador: " + contador);
    Assert.assertTrue(int1==contador);

    }

}
