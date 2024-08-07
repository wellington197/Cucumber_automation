package com.steps.features;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ReaproveitamentoCenariosRegex {

    @Dado("^que o ticket( especial)? é A.(\\d{3})$")
    public void que_o_ticket_é_af(String tipo, int arg1) throws Throwable {

    }
    @Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void que_o_valor_da_passagem_é_r$(int arg1, int arg2) {

    }
    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void que_o_nome_do_passageiro_é(String arg1) {

    }
    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void que_o_telefone_do_passageiro_é(String telefone) {

    }
    @Quando("^criar os steps$")
    public void criar_os_steps() {

    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {

    }
}