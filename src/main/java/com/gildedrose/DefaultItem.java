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

    protected void administrarCalidad() {
        if (calidad > 0) {
            calidad = calidad - 1;
        }
    }

    protected void administrarCaducidad() {
        expiraEn = expiraEn - 1;
    }

    protected void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (calidad > 0) {
                calidad = calidad - 1;
            }
        }
    }

    @Override
    public void update() {
        administrarCalidad();
        administrarCaducidad();
        administrarCalidadArticulosExpirados();
    }

    public boolean esSuNombre(String posibleNombre) {
        return this.nombre.equals(posibleNombre);
    }

    public boolean expiraEn(int cantidadDeDias) {
        return this.expiraEn == cantidadDeDias;
    }

    public boolean tieneCalidadDe(int supuestaCalidad) {
        return this.calidad == supuestaCalidad;
    }
}
