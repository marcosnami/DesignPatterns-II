package com.alura.designpatterns2.chapter6;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) throws Exception {
        String google = "https://maps.google.com.br/maps?q=" + rua;
        URL googleMap = new URL(google);
        InputStream mapa = googleMap.openStream();
        return "mapa";
    }
}
