package com.alura.designpatterns2.chapter2;

import org.jfugue.player.Player;

import java.util.List;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class Piano  {

    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder musicaEmNotas = new StringBuilder();
        for(Nota nota : musica) {
            musicaEmNotas.append(nota.simbolo() + " ");
        }

        player.play(musicaEmNotas.toString());
    }
}
