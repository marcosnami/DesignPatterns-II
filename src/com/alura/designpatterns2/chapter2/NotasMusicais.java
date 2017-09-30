package com.alura.designpatterns2.chapter2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<>();

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }

    public Nota pega(String nota) {
        return notas.get(nota);
    }
}
