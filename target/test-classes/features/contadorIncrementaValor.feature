#encoding: UTF-8
#language: pt


Funcionalidade: Calculo contador
  Como usuário do sitema de contagem
  O Contador consegur efetuar a soma de valores
  Para receber resultado total

//Contexto: Usuário insere valor inicial

  @ContadorCalculo
  Esquema do Cenário: Deve incrementar contador
    Dado que o valor é <valorInicial>
    Quando eu incremento mais <valorIncremental>
    Então o valor total será <valorTotal>
    Exemplos:
      | valorInicial | valorIncremental | valorTotal |
      | 8            | 15               | 23         |
      | 15           | 25               | 40         |


