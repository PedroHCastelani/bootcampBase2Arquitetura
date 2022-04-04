package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.ReportarBugPage;
import org.junit.Assert;
import org.junit.Test;
    //Primeiro teste a ser executado!
public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void testEfetuarLoginComSucesso(){
        loginPage = new LoginPage();
        LoginFlows loginFlows = new LoginFlows();
        ReportarBugPage reportarBugPage = new ReportarBugPage();

        String loginValido = "pedro.prado";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_GERAL, GlobalParameters.SENHA_GERAL);
        reportarBugPage.selecinoarProjeto();

        Assert.assertTrue(loginPage.retornaLoginComSucesso().contains(loginValido));
    }

    @Test
    public void testEfetuarLoginEmailInvalido(){
        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "emailinvalido@email.com";
        String senha = "123456";
        String mensagemErroEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
}
