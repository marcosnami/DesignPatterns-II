package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public interface Visitor {
    void visitaSoma(Soma soma);
    void visitaMultiplicacao(Multiplicacao multiplicacao);
    void visitaDivisao(Divisao divisao);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
}
