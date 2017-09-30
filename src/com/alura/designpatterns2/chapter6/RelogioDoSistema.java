package com.alura.designpatterns2.chapter6;

import java.util.Calendar;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public class RelogioDoSistema implements Relogio {
    @Override
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}
