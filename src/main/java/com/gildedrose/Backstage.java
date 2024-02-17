package com.gildedrose;

public class Backstage extends DefaultItem {
    public Backstage(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected void administrarCalidad() {
        if (calidad < 50) {
            calidad = calidad + 1;
            if (expiraEn < 11) {
                if (calidad < 50) {
                    calidad = calidad + 1;
                }
            }
            if (expiraEn < 6) {
                if (calidad < 50) {
                    calidad = calidad + 1;
                }
            }
        }
    }

    @Override
    protected void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            calidad = 0;
        }
    }
}
