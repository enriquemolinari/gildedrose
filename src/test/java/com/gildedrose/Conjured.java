package com.gildedrose;

public class Conjured extends DefaultItem {
    public Conjured(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected int calcularCalidad(int actualExpiraEn, int actualCalidad) {
        var calidad = super.calcularCalidad(actualExpiraEn, actualCalidad);
        return super.calcularCalidad(actualExpiraEn, calidad);
    }

    @Override
    protected int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad) {
        var calidad = super.calcularCalidadArticulosExpirados(actualExpiraEn, actualCalidad);
        return super.calcularCalidadArticulosExpirados(actualExpiraEn, calidad);
    }
}
