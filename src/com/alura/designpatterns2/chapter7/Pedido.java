package com.alura.designpatterns2.chapter7;

import java.util.Calendar;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private Calendar dataFinalizacao;


    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void paga() {
        status = Status.PAGO;
    }

    public void finaliza() {
        dataFinalizacao = Calendar.getInstance();
        status = Status.ENTREGUE;
    }
}
