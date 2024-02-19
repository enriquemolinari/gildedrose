package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected int calcularCalidad(int actualExpiraEn, int actualCalidad) {
        return actualCalidad;
    }


    @Override
    protected int montoParaExpirar() {
        return 0;
    }

    @Override
    protected int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad) {
        return actualCalidad;
    }
}
