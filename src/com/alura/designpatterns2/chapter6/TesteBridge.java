package com.alura.designpatterns2.chapter6;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class TesteBridge {

    public static void main(String[] args) {

        Mapa mapa = new GoogleMaps();
        try {
            String conteudo = mapa.devolveMapa("Lacerda Franco");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Mapa mapa1 = new MapLinks();
        try {
            String conteudo = mapa1.devolveMapa("Lacerda Franco");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
