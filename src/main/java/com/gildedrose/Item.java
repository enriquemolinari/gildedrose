package com.gildedrose;

public abstract class Item {

    protected String nombre;
    protected int expiraEn; //expresado en días
    protected int calidad;

    public Item(String nombre, int expiraEn, int calidad) {
        this.nombre = nombre;
        this.expiraEn = expiraEn;
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.expiraEn + ", " + this.calidad;
    }

    public void update() {
        administrarCalidad();
        administrarCaducidad();
        administrarCalidadArticulosExpirados();
    }

    protected abstract void administrarCalidadArticulosExpirados();

    protected void administrarCaducidad() {
        expiraEn = expiraEn - 1;
    }

    protected abstract void administrarCalidad();

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
