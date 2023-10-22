package org.example.model;


import org.example.interf.AparelhoTelefonico;
import org.example.interf.NavegadorInternet;
import org.example.interf.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("\tLigando...");
    }

    @Override
    public void atender() {
        System.out.println("\tAtendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("\tIniciando Correio de Voz (Caixa Postal)...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("\tExibindo página no browser");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\tAbrindo nova aba no browser");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\tAtualizando página no browser...");
    }

    @Override
    public void tocar() {
        System.out.println("\tTocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("\tMúsica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("\tSelecionando música...");
    }
}
