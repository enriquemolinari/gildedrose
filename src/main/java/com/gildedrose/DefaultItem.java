package com.gildedrose;

public class DefaultItem extends Item {

    public DefaultItem(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    protected void administrarCalidad() {
        if (calidad > 0) {
            calidad = calidad - 1;
        }
    }

    protected void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (calidad > 0) {
                calidad = calidad - 1;
            }
        }
    }
}
