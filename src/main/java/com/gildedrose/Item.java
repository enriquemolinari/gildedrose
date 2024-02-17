package com.gildedrose;

public class Item {
    private String nombre;
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

    void administrarCalidad() {
        if (!nombre.equals("Aged Brie")
                && !nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (calidad > 0) {
                if (!nombre.equals("Sulfuras, Hand of Ragnaros")) {
                    calidad = calidad - 1;
                }
            }
        } else {
            if (calidad < 50) {
                calidad = calidad + 1;
                if (nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (expiraEn < 11) {
                        if (calidad < 50) {
                            calidad = calidad + 1;
                        }
                    }
                    if (expiraEn < 6) {
                        if (calidad < 50) {
                            calidad = calidad + 1;
                        }
                    }
                }
            }
        }
    }

    void administrarCaducidad() {
        if (!nombre.equals("Sulfuras, Hand of Ragnaros")) {
            expiraEn = expiraEn - 1;
        }
    }

    void administrarCalidadArticulosExpirados() {
        if (expiraEn < 0) {
            if (!nombre.equals("Aged Brie")) {
                if (!nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (calidad > 0) {
                        if (!nombre.equals("Sulfuras, Hand of Ragnaros")) {
                            calidad = calidad - 1;
                        }
                    }
                } else {
                    calidad = 0;
                }
            } else {
                if (calidad < 50) {
                    calidad = calidad + 1;
                }
            }
        }
    }

    public String nombre() {
        return nombre;
    }

    public int expiraEn() {
        return expiraEn;
    }

    public int calidad() {
        return calidad;
    }
}
