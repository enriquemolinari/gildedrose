package com.gildedrose;

public interface Item {
    void administrarCalidad();

    void administrarCaducidad();

    void administrarCalidadArticulosExpirados();

    boolean esSuNombre(String posibleNombre);

    boolean expiraEn(int cantidadDeDias);

    boolean tieneCalidadDe(int supuestaCalidad);
}
