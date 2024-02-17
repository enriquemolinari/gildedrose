package com.gildedrose;

public class Item {
    public String nombre;
    public int expiraEn; //expresado en días
    public int calidad;

    public Item(String nombre, int expiraEn, int calidad) {
        this.nombre = nombre;
        this.expiraEn = expiraEn;
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.expiraEn + ", " + this.calidad;
    }
}
