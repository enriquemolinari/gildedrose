package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected void administrarCalidad() {
    }

    @Override
    protected void administrarCaducidad() {
    }

    @Override
    protected void administrarCalidadArticulosExpirados() {
    }
}
