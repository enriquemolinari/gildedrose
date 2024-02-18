package com.gildedrose;

public class Conjured extends DefaultItem {
    public Conjured(String nombre, int expiraEn, int calidad) {
        super(nombre, expiraEn, calidad);
    }

    @Override
    protected void administrarCalidad() {
        super.administrarCalidad();
        super.administrarCalidad();
    }

    @Override
    protected void administrarCalidadArticulosExpirados() {
        super.administrarCalidadArticulosExpirados();
        super.administrarCalidadArticulosExpirados();
    }
}
