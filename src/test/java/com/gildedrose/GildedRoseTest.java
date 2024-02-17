package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GildedRoseTest {

    @Test
    public void productosDegradanSuCalidadCuandoEnvejecen() {
        Item[] items = new Item[]{new Item("foo", 5, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("foo"));
        assertTrue(app.items[0].tieneCalidadDe(2));
        assertTrue(app.items[0].expiraEn(2));
    }

    @Test
    public void productosDegradanDobleSiCaducaron() {
        Item[] items = new Item[]{new Item("foo", 1, 6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("foo"));
        assertTrue(app.items[0].tieneCalidadDe(1));
        assertTrue(app.items[0].expiraEn(-2));
    }

    @Test
    public void sulfurasNuncaSeVenceNiDisminuyeLaCalidad() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Sulfuras, Hand of Ragnaros"));
        assertTrue(app.items[0].tieneCalidadDe(80));
        assertTrue(app.items[0].expiraEn(5));
    }


    @Test
    public void calidadNuncaPuedeSerNegativa() {
        Item[] items = new Item[]{new Item("foo", 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("foo"));
        assertTrue(app.items[0].tieneCalidadDe(0));
        assertTrue(app.items[0].expiraEn(-3));
    }

    @Test
    public void egedBrieAumentaLaCalidadAMedidaQueEnvejece() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Aged Brie"));
        assertTrue(app.items[0].tieneCalidadDe(4));
        assertTrue(app.items[0].expiraEn(6));
    }

    @Test
    public void agedBrieAumentaDobleCuandoCaduca() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Aged Brie"));
        assertTrue(app.items[0].tieneCalidadDe(6));
        assertTrue(app.items[0].expiraEn(-2));
    }

    @Test
    public void egedBrieAumentaPeroNoSupera50() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 60; i++) {
            app.updateQuality();
        }
        assertTrue(app.items[0].esSuNombre("Aged Brie"));
        assertTrue(app.items[0].tieneCalidadDe(50));
        assertTrue(app.items[0].expiraEn(-50));
    }

    @Test
    public void backstageAumentaTambienComoAgedBrie() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                20, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Backstage passes to a TAFKAL80ETC concert"));
        assertTrue(app.items[0].tieneCalidadDe(4));
        assertTrue(app.items[0].expiraEn(16));
    }

    @Test
    public void backstageAumentaDobleCuando10DiasOMenosYMasDeCinco() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Backstage passes to a TAFKAL80ETC concert"));
        assertTrue(app.items[0].tieneCalidadDe(8));
        assertTrue(app.items[0].expiraEn(6));
    }

    @Test
    public void backstageAumentaTripleCuando5DiasOMenos() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Backstage passes to a TAFKAL80ETC concert"));
        assertTrue(app.items[0].tieneCalidadDe(12));
        assertTrue(app.items[0].expiraEn(1));
    }

    @Test
    public void backstageQuedaEnCalidad0CuandoYaPasoElConcierto() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertTrue(app.items[0].esSuNombre("Backstage passes to a TAFKAL80ETC concert"));
        assertTrue(app.items[0].tieneCalidadDe(0));
        assertTrue(app.items[0].expiraEn(-4));
    }
}
