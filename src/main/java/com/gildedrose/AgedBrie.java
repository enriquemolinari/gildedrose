package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected void administrarCalidad() {
        if (calidad < 50) {
            calidad = calidad + 1;
        }
    }

    @Override
    protected void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (calidad < 50) {
                calidad = calidad + 1;
            }
        }
    }
}
