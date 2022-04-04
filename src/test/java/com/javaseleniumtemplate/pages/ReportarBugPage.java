package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportarBugPage extends PageBase {

    By reportCaso = By.linkText("Relatar Caso");
    By selectionProjeto = By.xpath("//select[1][contains(.,'Tesrt')]");
    By newCategoria = By.name("category_id");
    By sumaryCampo = By.xpath("//input[@name='summary']");
    By descriptionCampo = By.xpath("//textarea[@name='description']");
    By selectionEnviarRelatorio = By.xpath("//input[@value='Enviar Relatório']");
    By CategoryCadastradaComSucesso = By.xpath("//div[contains(.,'Operação realizada com sucesso.')]");
    By menssagemDeErroDePreenchimentoCampoObrigatorio = By.className("form-title");


    public void selecinoarProjeto(){
        comboBoxSelectByVisibleText(selectionProjeto, "Tesrt");
    }

    public void clicarNoBotaoRelatarCaso() {
        click(reportCaso);
    }

    public void newCategoria(){
        comboBoxSelectByVisibleText(newCategoria, "[Todos os Projetos] Pedro Castelani");
    }

    public void preencherResumo(String resumo){
        sendKeys(sumaryCampo, resumo);
    }

    public void preencherDescricao(String descricao){
        sendKeys(descriptionCampo, descricao);
    }

    public void clicarBotaoEnviarRelatorio() {
        click(selectionEnviarRelatorio);
    }

    public String retornarMenssagemCasoCriadoComSucesso(){
        return getText(CategoryCadastradaComSucesso);
    }

    public String retornarMensagemCasoCriadoComErro(){
        return getText(menssagemDeErroDePreenchimentoCampoObrigatorio);
    }


}
