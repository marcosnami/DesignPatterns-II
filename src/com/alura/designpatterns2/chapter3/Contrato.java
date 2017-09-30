package com.alura.designpatterns2.chapter3;

import java.util.Calendar;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Contrato {
    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Calendar getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public Estado salvaEstado() {
        return new Estado(new Contrato(this.data, this.cliente, this.tipo));
    }

    public void avanca() {
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }

    public void restaura(Estado estado) {
        this.data = estado.getContrato().getData();
        this.cliente = estado.getContrato().getCliente();
        this.tipo = estado.getContrato().getTipo();
    }

}
