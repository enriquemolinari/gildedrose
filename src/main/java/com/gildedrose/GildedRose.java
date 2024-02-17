package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].nombre.equals("Aged Brie")
                    && !items[i].nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].calidad > 0) {
                    if (!items[i].nombre.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].calidad = items[i].calidad - 1;
                    }
                }
            } else {
                if (items[i].calidad < 50) {
                    items[i].calidad = items[i].calidad + 1;

                    if (items[i].nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].expiraEn < 11) {
                            if (items[i].calidad < 50) {
                                items[i].calidad = items[i].calidad + 1;
                            }
                        }

                        if (items[i].expiraEn < 6) {
                            if (items[i].calidad < 50) {
                                items[i].calidad = items[i].calidad + 1;
                            }
                        }
                    }
                }
            }
            if (!items[i].nombre.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].expiraEn = items[i].expiraEn - 1;
            }
            if (items[i].expiraEn < 0) {
                if (!items[i].nombre.equals("Aged Brie")) {
                    if (!items[i].nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].calidad > 0) {
                            if (!items[i].nombre.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].calidad = items[i].calidad - 1;
                            }
                        }
                    } else {
                        items[i].calidad = 0;
                    }
                } else {
                    if (items[i].calidad < 50) {
                        items[i].calidad = items[i].calidad + 1;
                    }
                }
            }
        }
    }
}
