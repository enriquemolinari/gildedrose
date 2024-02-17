package com.gildedrose;

public class Sulfuras extends DefaultItem {
    public Sulfuras(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    public void administrarCalidad() {
    }

    @Override
    public void administrarCaducidad() {
    }

    @Override
    public void administrarCalidadArticulosExpirados() {
    }
}
