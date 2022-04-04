package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ReportarBugPage;
import org.junit.Assert;
import org.junit.Test;

//Esse testes deve ser executado após a execução do teste AdicionarCategoriaPageTest!
public class ReportarBugTests extends TestBase {
    ReportarBugPage reportarBugPage;

    @Test
    public void testcadastrarNovoCasoDeTeste() {
        reportarBugPage = new ReportarBugPage();
        LoginFlows loginFlows = new LoginFlows();

        String resumo = "Mensagem gerada com erro de digitação";
        String descricao = "Teste realizado para verificar nome dos itens cadastrados, retornando com erro de digitação";
        String menssagemEsperada = "Operação realizada com sucesso.";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_GERAL, GlobalParameters.SENHA_GERAL);
        reportarBugPage.clicarNoBotaoRelatarCaso();
        reportarBugPage.selecinoarProjeto();
        reportarBugPage.newCategoria();
        reportarBugPage.preencherResumo(resumo);
        reportarBugPage.preencherDescricao(descricao);
        reportarBugPage.clicarBotaoEnviarRelatorio();

        Assert.assertTrue(reportarBugPage.retornarMenssagemCasoCriadoComSucesso().contains(menssagemEsperada));
    }

    @Test
    public void testcasoDeTestesSemPreencherCamposObrigatorios(){
        reportarBugPage = new ReportarBugPage();
        LoginFlows loginFlows = new LoginFlows();

        String messagemEsperadaFaltaDeCampoObrigagtorio = "APPLICATION ERROR #11";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_GERAL, GlobalParameters.SENHA_GERAL);
        reportarBugPage.clicarNoBotaoRelatarCaso();
        reportarBugPage.selecinoarProjeto();
        reportarBugPage.newCategoria();
        reportarBugPage.clicarBotaoEnviarRelatorio();

        Assert.assertTrue(reportarBugPage.retornarMensagemCasoCriadoComErro().contains(messagemEsperadaFaltaDeCampoObrigagtorio));
    }
}
