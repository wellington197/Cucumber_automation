package com.steps.features;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class aprenderCucumber {

    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
        System.out.println("Teste 01 - OK");
    }

    @Quando("executa-lo")
    public void executa_lo() {
        System.out.println("Teste 02 - OK");
    }

    @Então("a especicificação deve finalizar com sucesso")
    public void a_especicificação_deve_finalizar_com_sucesso() {
        System.out.println("Teste 03 - OK");
    }

}