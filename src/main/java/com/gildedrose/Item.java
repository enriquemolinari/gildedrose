package com.gildedrose;

public abstract class Item {

    private final String nombre;
    private int expiraEn; //expresado en días
    private int calidad;

    public Item(String nombre, int expiraEn, int calidad) {
        this.nombre = nombre;
        this.expiraEn = expiraEn;
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.expiraEn + ", " + this.calidad;
    }

    public final void update() {
        this.calidad = calcularCalidad(this.expiraEn, this.calidad);
        expiraEn = expiraEn - montoParaExpirar();
        this.calidad = calcularCalidadArticulosExpirados(this.expiraEn, this.calidad);
    }

    protected int montoParaExpirar() {
        return 1;
    }

    protected abstract int calcularCalidad(int actualExpiraEn, int actualCalidad);

    protected abstract int calcularCalidadArticulosExpirados(int actualExpiraEn, int actualCalidad);

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
