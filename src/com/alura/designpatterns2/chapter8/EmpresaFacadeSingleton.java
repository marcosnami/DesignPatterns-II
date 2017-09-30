package com.alura.designpatterns2.chapter8;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class EmpresaFacadeSingleton {

    private static EmpresaFacade instancia;

    public EmpresaFacade getInstancia() {
        if (instancia == null) {
            instancia = new EmpresaFacade();
        }
        return instancia;
    }
}
