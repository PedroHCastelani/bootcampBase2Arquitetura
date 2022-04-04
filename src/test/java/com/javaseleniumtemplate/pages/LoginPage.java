package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {


    //Mapping
    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.className("button");
    By errorMessageLabel = By.tagName("font");
    By loginComSucesso = By.xpath("//span[@class=\"italic\"]");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public String retornaMensagemErroLogin(){
        return getText(errorMessageLabel);
    }

    public String retornaLoginComSucesso(){
        return getText(loginComSucesso);
    }
}
