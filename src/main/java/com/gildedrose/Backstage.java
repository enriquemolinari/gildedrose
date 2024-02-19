package com.gildedrose;

public class Backstage extends Item {
    public Backstage(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected int calcularCalidad(int actualExpiraEn, int actualCalidad) {
        var calidad = actualCalidad;
        if (calidad < 50) {
            calidad = calidad + 1;
            if (actualExpiraEn < 11) {
                if (calidad < 50) {
                    calidad = calidad + 1;
                }
            }
            if (actualExpiraEn < 6) {
                if (calidad < 50) {
                    calidad = calidad + 1;
                }
            }
        }
        return calidad;
    }

    @Override
    protected int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad) {
        if (actualExpiraEn < 0) {
            return 0;
        }
        return actualCalidad;
    }
}
