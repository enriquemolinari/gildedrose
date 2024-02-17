package com.gildedrose;

public class DefaultItem implements Item {
    protected String nombre;
    protected int expiraEn; //expresado en días
    protected int calidad;

    public DefaultItem(String nombre, int expiraEn, int calidad) {
        this.nombre = nombre;
        this.expiraEn = expiraEn;
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.expiraEn + ", " + this.calidad;
    }

    @Override
    public void administrarCalidad() {
        if (calidad > 0) {
            calidad = calidad - 1;
        }
    }

    @Override
    public void administrarCaducidad() {
        expiraEn = expiraEn - 1;
    }

    @Override
    public void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (calidad > 0) {
                calidad = calidad - 1;
            }
        }
    }

    @Override
    public boolean esSuNombre(String posibleNombre) {
        return this.nombre.equals(posibleNombre);
    }

    @Override
    public boolean expiraEn(int cantidadDeDias) {
        return this.expiraEn == cantidadDeDias;
    }

    @Override
    public boolean tieneCalidadDe(int supuestaCalidad) {
        return this.calidad == supuestaCalidad;
    }
}
