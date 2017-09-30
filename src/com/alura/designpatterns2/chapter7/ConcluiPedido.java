package com.alura.designpatterns2.chapter7;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class ConcluiPedido implements Comando {

    private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Finalizando o pedido do cliente: " + pedido.getCliente());
        pedido.finaliza();
    }
}
