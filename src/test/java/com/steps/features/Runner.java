package com.steps.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = "pretty", // adiciona plugin para visualizar
        monochrome=true, //Evita sistema inserir cores que causam caracteres especiais.
        snippets = CucumberOptions.SnippetType.CAMELCASE, // Cria nomes dos métodos sem Underline
        dryRun = false //[True]Faz uma validação se está tudo ok, sem executar. (Para testes muito longos. Faz e depois passar tudo, executa)
        //strict = true, //Se inserir outro passo. ele vai dar erro.

        //,glue={"src/main/stepDefinition"}
)

public class Runner {

}