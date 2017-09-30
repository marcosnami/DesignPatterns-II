package com.alura.designpatterns2.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class FilaDeTrabalho {

    private List<Comando> comandos;

    public FilaDeTrabalho() {
        comandos = new ArrayList<>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
        for(Comando comando : comandos) {
            comando.executa();
        }
    }
}
