package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class RaizQuadrada implements Expressao {

    private Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(expressao.avalia());
    }

    @Override
    public void aceita(Visitor visitor) {

    }
}
