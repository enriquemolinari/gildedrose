package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected int calcularCalidad(int actualExpiraEn, int actualCalidad) {
        if (actualCalidad < 50) {
            return actualCalidad + 1;
        }
        return actualCalidad;
    }

    @Override
    protected int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad) {
        if (actualExpiraEn < 0) {
            if (actualCalidad < 50) {
                return actualCalidad + 1;
            }
        }
        return actualCalidad;
    }
}
