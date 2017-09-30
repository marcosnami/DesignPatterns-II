package com.alura.designpatterns2.chapter8;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Servico {

    protected Servico servico = new ServicoSingleton().getInstancia();
}
