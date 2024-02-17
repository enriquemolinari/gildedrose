package com.gildedrose;

class GildedRose {
    DefaultItem[] items;

    public GildedRose(DefaultItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }
}
