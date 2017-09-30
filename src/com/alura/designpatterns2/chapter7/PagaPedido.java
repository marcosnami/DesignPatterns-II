package com.alura.designpatterns2.chapter7;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Pagando o pedido do cliente: " + pedido.getCliente());
        pedido.paga();
    }
}
