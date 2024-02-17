package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.nombre.equals("Aged Brie")
                    && !item.nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.calidad > 0) {
                    if (!item.nombre.equals("Sulfuras, Hand of Ragnaros")) {
                        item.calidad = item.calidad - 1;
                    }
                }
            } else {
                if (item.calidad < 50) {
                    item.calidad = item.calidad + 1;

                    if (item.nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.expiraEn < 11) {
                            if (item.calidad < 50) {
                                item.calidad = item.calidad + 1;
                            }
                        }

                        if (item.expiraEn < 6) {
                            if (item.calidad < 50) {
                                item.calidad = item.calidad + 1;
                            }
                        }
                    }
                }
            }
            if (!item.nombre.equals("Sulfuras, Hand of Ragnaros")) {
                item.expiraEn = item.expiraEn - 1;
            }
            if (item.expiraEn < 0) {
                if (!item.nombre.equals("Aged Brie")) {
                    if (!item.nombre.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.calidad > 0) {
                            if (!item.nombre.equals("Sulfuras, Hand of Ragnaros")) {
                                item.calidad = item.calidad - 1;
                            }
                        }
                    } else {
                        item.calidad = 0;
                    }
                } else {
                    if (item.calidad < 50) {
                        item.calidad = item.calidad + 1;
                    }
                }
            }
        }
    }
}
