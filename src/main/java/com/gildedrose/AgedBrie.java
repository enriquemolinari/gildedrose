package com.gildedrose;

public class AgedBrie extends DefaultItem {
    public AgedBrie(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    public void administrarCalidad() {
        if (calidad < 50) {
            calidad = calidad + 1;
        }
    }

    @Override
    public void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (calidad < 50) {
                calidad = calidad + 1;
            }
        }
    }
}
