package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int avalia() {
        return numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaNumero(this);
    }
}
