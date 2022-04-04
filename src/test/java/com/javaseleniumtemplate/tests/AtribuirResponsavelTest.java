package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.AtribuirResponsavelPage;
import com.javaseleniumtemplate.pages.ReportarBugPage;
import org.junit.Assert;
import org.junit.Test;

//Esse teste é o último a ser executado!
public class AtribuirResponsavelTest extends TestBase {
    AtribuirResponsavelPage atribuirResponsavelPage;

    @Test
    public void testAtribuirResponavel(){
        atribuirResponsavelPage = new AtribuirResponsavelPage();
        LoginFlows loginFlows = new LoginFlows();
        ReportarBugPage reportarBugPage = new ReportarBugPage();

        String responsavel = "pedro.prado";
        String valorCasoDeTeste = "0009454";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_GERAL, GlobalParameters.SENHA_GERAL);
        reportarBugPage.selecinoarProjeto();
        atribuirResponsavelPage.selecionarBotaoMonitoradosPorMim();
        atribuirResponsavelPage.selecionarCasoDeTeste();
        atribuirResponsavelPage.selecionarOpcaoAtribuir();
        atribuirResponsavelPage.clicarBotaoOK();
        atribuirResponsavelPage.selecionarResponsavel();
        atribuirResponsavelPage.clicarBotaoAtribuirCaso();

        Assert.assertTrue(atribuirResponsavelPage.retornarValorCasoDeTeste().contains(valorCasoDeTeste));
        Assert.assertTrue(atribuirResponsavelPage.retornarMenssagemResponsal().contains(responsavel));
    }
}
