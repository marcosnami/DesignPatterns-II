package com.alura.designpatterns2.chapter4;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class TesteInterpreter {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Multiplicacao(new Numero(10), new Numero(2)), new Numero(5));
        Expressao direita = new Soma(new Soma(new Numero(2), new Numero(5)), new Divisao(new Numero(10), new Numero(2)));

        Expressao conta = new Soma(esquerda, direita);

        int resultado = conta.avalia();
        System.out.println(resultado);

        Visitor visitor = new Impressora();
        conta.aceita(visitor);

        Visitor visitor1 = new PreFixaVisitor();
        conta.aceita(visitor1);
    }
}
