package com.steps.features;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ReaproveitamentoCenariosRegex {

    @Dado("^que o ticket é AF(\\d+)$")
    public void que_o_ticket_é_af(int arg1) throws Throwable {

    }
    @Dado("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double double1) {

    }
    @Dado("que o nome do passageiro é {string}")
    public void que_o_nome_do_passageiro_é(String string) {

    }
    @Dado("que o telefone do passageiro é {int}-{int}")
    public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {

    }
    @Quando("criar os steps")
    public void criar_os_steps() {

    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {

    }
}