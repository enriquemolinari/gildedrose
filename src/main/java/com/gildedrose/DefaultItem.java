package com.gildedrose;

public class DefaultItem extends Item {

    public DefaultItem(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    protected int calcularCalidad(int actualExpiraEn, int actualCalidad) {
        if (actualCalidad > 0) {
            return actualCalidad - 1;
        }
        return actualCalidad;
    }

    protected int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad) {
        if (actualExpiraEn < 0) {
            if (actualCalidad > 0) {
                return actualCalidad - 1;
            }
        }
        return actualCalidad;
    }
}
