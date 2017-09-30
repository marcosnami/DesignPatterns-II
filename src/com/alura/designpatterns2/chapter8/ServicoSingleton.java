package com.alura.designpatterns2.chapter8;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class ServicoSingleton {

    private static Servico instancia;

    public Servico getInstancia() {
        if (instancia == null) {
            instancia = new Servico();
        }
        return instancia;
    }
}
