package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.AdicionarCategoriaPage;
import com.javaseleniumtemplate.pages.ReportarBugPage;
import org.junit.Assert;
import org.junit.Test;

//Esse teste deve ser executado após o LoginTests!
public class AdicionarCategoriaTest extends TestBase {

    AdicionarCategoriaPage adicionarCategoriaPage;

    @Test
    public void testAdicionarNovaCategoria() {
        adicionarCategoriaPage = new AdicionarCategoriaPage();
        LoginFlows loginFlows = new LoginFlows();
        ReportarBugPage reportarBugPage = new ReportarBugPage();

        String novaCategoria = "Pedro Castelani";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_GERAL, GlobalParameters.SENHA_GERAL);
        reportarBugPage.selecinoarProjeto();
        adicionarCategoriaPage.clicarBotaoGerenciar();
        adicionarCategoriaPage.clicarBotaoGerenciarProjeto();
        adicionarCategoriaPage.adicionarNovaCategoria(novaCategoria);
        adicionarCategoriaPage.clicarBotaoAdicionarCategtoria();
        adicionarCategoriaPage.refresh();

        Assert.assertTrue(novaCategoria, adicionarCategoriaPage.retornarCategoriaCriadaComSucesso().contains(novaCategoria));
    }





}
