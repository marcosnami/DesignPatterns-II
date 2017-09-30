package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public interface Expressao {
    int avalia();
    void aceita(Visitor visitor);
}
