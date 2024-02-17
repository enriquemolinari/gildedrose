package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void productosDegradanSuCalidadCuandoEnvejecen() {
        Item[] items = new Item[]{new Item("foo", 5, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items[0].nombre());
        assertEquals(2, app.items[0].calidad());
        assertEquals(2, app.items[0].expiraEn());
    }

    @Test
    public void productosDegradanDobleSiCaducaron() {
        Item[] items = new Item[]{new Item("foo", 1, 6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items[0].nombre());
        assertEquals(1, app.items[0].calidad());
        assertEquals(-2, app.items[0].expiraEn());
    }

    @Test
    public void sulfurasNuncaSeVenceNiDisminuyeLaCalidad() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].nombre());
        assertEquals(80, app.items[0].calidad());
        assertEquals(5, app.items[0].expiraEn());
    }


    @Test
    public void calidadNuncaPuedeSerNegativa() {
        Item[] items = new Item[]{new Item("foo", 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items[0].nombre());
        assertEquals(0, app.items[0].calidad());
        assertEquals(-3, app.items[0].expiraEn());
    }

    @Test
    public void egedBrieAumentaLaCalidadAMedidaQueEnvejece() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].nombre());
        assertEquals(4, app.items[0].calidad());
        assertEquals(6, app.items[0].expiraEn());
    }

    @Test
    public void agedBrieAumentaDobleCuandoCaduca() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].nombre());
        assertEquals(6, app.items[0].calidad());
        assertEquals(-2, app.items[0].expiraEn());
    }

    @Test
    public void egedBrieAumentaPeroNoSupera50() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 60; i++) {
            app.updateQuality();
        }
        assertEquals("Aged Brie", app.items[0].nombre());
        assertEquals(50, app.items[0].calidad());
        assertEquals(-50, app.items[0].expiraEn());
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
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].nombre());
        assertEquals(4, app.items[0].calidad());
        assertEquals(16, app.items[0].expiraEn());
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
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].nombre());
        assertEquals(8, app.items[0].calidad());
        assertEquals(6, app.items[0].expiraEn());
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
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].nombre());
        assertEquals(12, app.items[0].calidad());
        assertEquals(1, app.items[0].expiraEn());
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
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].nombre());
        assertEquals(0, app.items[0].calidad());
        assertEquals(-4, app.items[0].expiraEn());
    }
}
