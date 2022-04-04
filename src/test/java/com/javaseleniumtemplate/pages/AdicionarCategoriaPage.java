package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class AdicionarCategoriaPage extends PageBase {

    By buttonGerenciar = By.linkText("Gerenciar");
    By buttonGerenciarProduto = By.cssSelector("span.bracket-link a:first-child");
    By campName = By.cssSelector("input[name=name]");
    By buttonAdicionarCategoria = By.cssSelector("input.button");
    By CategoriaCriadaComSucesso = By.xpath("//tr[19]/td[1]");
    By buttonDeletar = By.cssSelector("action=\"manage_proj_cat_delete.php?id=373&project_id=0\"");

    public void clicarBotaoGerenciar(){
        click(buttonGerenciar);
    }

    public void clicarBotaoGerenciarProjeto(){
        click(buttonGerenciarProduto);
    }

    public void adicionarNovaCategoria(String novaCategoria){
        sendKeys(campName, novaCategoria);
    }

    public void clicarBotaoAdicionarCategtoria(){
        click(buttonAdicionarCategoria);
    }

    public String retornarCategoriaCriadaComSucesso(){
        return getText(CategoriaCriadaComSucesso);
    }

    public void deletarCategoria(){
        click(buttonDeletar);
    }
}
