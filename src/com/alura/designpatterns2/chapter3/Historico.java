package com.alura.designpatterns2.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado pega(int index) {
        return estadosSalvos.get(index);
    }

    public void adiciona(Estado estado) {
        estadosSalvos.add(estado);
    }
}
