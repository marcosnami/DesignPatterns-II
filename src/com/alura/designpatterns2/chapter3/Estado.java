package com.alura.designpatterns2.chapter3;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Estado {

    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }


}
