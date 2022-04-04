package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class AtribuirResponsavelPage extends PageBase {

    By selectionBotaoMonitoradosPorMim = By.xpath("//a[.='Monitorados por Mim']");
    By selectionBotaoCasoDeTeste = By.xpath("//input[@value='9454']");
    By selectionOpcaoAtribuir = By.xpath("//option[@value='ASSIGN']");
    By buttonOK = By.xpath("//input[@value='OK']");
    By selectionResposavel = By.xpath("//option[.='pedro.prado']");
    By buttonAtribuir = By.xpath("//input[@value='Atribuir Casos']");
    By returnValorCasoDeTeste = By.xpath("//td[.='0009454']");
    By returnMenssagemResponsal = By.xpath("//a[contains(text(),'pedro.prado')]");

    public void selecionarBotaoMonitoradosPorMim(){
        click(selectionBotaoMonitoradosPorMim);
    }

    public void selecionarCasoDeTeste(){
        click(selectionBotaoCasoDeTeste);
    }

    public void selecionarOpcaoAtribuir(){
        click(selectionOpcaoAtribuir);
    }

    public void clicarBotaoOK(){
        click(buttonOK);
    }

    public void selecionarResponsavel(){
        click(selectionResposavel);
    }

    public void clicarBotaoAtribuirCaso(){
        click(buttonAtribuir);
    }

    public String retornarValorCasoDeTeste(){
        return getText(returnValorCasoDeTeste);
    }

    public String retornarMenssagemResponsal(){
        return getText(returnMenssagemResponsal);
    }

}
