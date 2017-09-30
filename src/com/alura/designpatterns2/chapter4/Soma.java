package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda + resultadoDaDireita;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaSoma(this);
    }
}
