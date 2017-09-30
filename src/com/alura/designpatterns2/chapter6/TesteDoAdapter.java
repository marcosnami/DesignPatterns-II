package com.alura.designpatterns2.chapter6;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class TesteDoAdapter {

    public static void main(String[] args) {

        Relogio relogio = new RelogioDoSistema();
        System.out.println(relogio.hoje().getCalendarType());
    }
}
