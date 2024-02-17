package com.gildedrose;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class OriginalTextTest {

    @Test
    public void test() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        var out = new PrintStream(outputStream);

        Item[] items = new Item[]{
                new DefaultItem("+5 Dexterity Vest", 10, 20), //
                new DefaultItem("Aged Brie", 2, 0), //
                new DefaultItem("Elixir of the Mongoose", 5, 7), //
                new DefaultItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                new DefaultItem("Sulfuras, Hand of Ragnaros", -1, 80),
                new DefaultItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new DefaultItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new DefaultItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet, no esta correctamente testeado aqui aun
                //new Item("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);

        int days = 12;

        for (int i = 0; i < days; i++) {
            out.println("-------- day " + i + " --------");
            out.println("name, sellIn, quality");
            for (Item item : items) {
                out.println(item);
            }
            out.println();
            app.updateQuality();
        }
        String expected = """
                -------- day 0 --------
                name, sellIn, quality
                +5 Dexterity Vest, 10, 20
                Aged Brie, 2, 0
                Elixir of the Mongoose, 5, 7
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 15, 20
                Backstage passes to a TAFKAL80ETC concert, 10, 49
                Backstage passes to a TAFKAL80ETC concert, 5, 49

                -------- day 1 --------
                name, sellIn, quality
                +5 Dexterity Vest, 9, 19
                Aged Brie, 1, 1
                Elixir of the Mongoose, 4, 6
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 14, 21
                Backstage passes to a TAFKAL80ETC concert, 9, 50
                Backstage passes to a TAFKAL80ETC concert, 4, 50

                -------- day 2 --------
                name, sellIn, quality
                +5 Dexterity Vest, 8, 18
                Aged Brie, 0, 2
                Elixir of the Mongoose, 3, 5
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 13, 22
                Backstage passes to a TAFKAL80ETC concert, 8, 50
                Backstage passes to a TAFKAL80ETC concert, 3, 50

                -------- day 3 --------
                name, sellIn, quality
                +5 Dexterity Vest, 7, 17
                Aged Brie, -1, 4
                Elixir of the Mongoose, 2, 4
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 12, 23
                Backstage passes to a TAFKAL80ETC concert, 7, 50
                Backstage passes to a TAFKAL80ETC concert, 2, 50

                -------- day 4 --------
                name, sellIn, quality
                +5 Dexterity Vest, 6, 16
                Aged Brie, -2, 6
                Elixir of the Mongoose, 1, 3
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 11, 24
                Backstage passes to a TAFKAL80ETC concert, 6, 50
                Backstage passes to a TAFKAL80ETC concert, 1, 50

                -------- day 5 --------
                name, sellIn, quality
                +5 Dexterity Vest, 5, 15
                Aged Brie, -3, 8
                Elixir of the Mongoose, 0, 2
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 10, 25
                Backstage passes to a TAFKAL80ETC concert, 5, 50
                Backstage passes to a TAFKAL80ETC concert, 0, 50

                -------- day 6 --------
                name, sellIn, quality
                +5 Dexterity Vest, 4, 14
                Aged Brie, -4, 10
                Elixir of the Mongoose, -1, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 9, 27
                Backstage passes to a TAFKAL80ETC concert, 4, 50
                Backstage passes to a TAFKAL80ETC concert, -1, 0

                -------- day 7 --------
                name, sellIn, quality
                +5 Dexterity Vest, 3, 13
                Aged Brie, -5, 12
                Elixir of the Mongoose, -2, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 8, 29
                Backstage passes to a TAFKAL80ETC concert, 3, 50
                Backstage passes to a TAFKAL80ETC concert, -2, 0

                -------- day 8 --------
                name, sellIn, quality
                +5 Dexterity Vest, 2, 12
                Aged Brie, -6, 14
                Elixir of the Mongoose, -3, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 7, 31
                Backstage passes to a TAFKAL80ETC concert, 2, 50
                Backstage passes to a TAFKAL80ETC concert, -3, 0

                -------- day 9 --------
                name, sellIn, quality
                +5 Dexterity Vest, 1, 11
                Aged Brie, -7, 16
                Elixir of the Mongoose, -4, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 6, 33
                Backstage passes to a TAFKAL80ETC concert, 1, 50
                Backstage passes to a TAFKAL80ETC concert, -4, 0

                -------- day 10 --------
                name, sellIn, quality
                +5 Dexterity Vest, 0, 10
                Aged Brie, -8, 18
                Elixir of the Mongoose, -5, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 5, 35
                Backstage passes to a TAFKAL80ETC concert, 0, 50
                Backstage passes to a TAFKAL80ETC concert, -5, 0

                -------- day 11 --------
                name, sellIn, quality
                +5 Dexterity Vest, -1, 8
                Aged Brie, -9, 20
                Elixir of the Mongoose, -6, 0
                Sulfuras, Hand of Ragnaros, 0, 80
                Sulfuras, Hand of Ragnaros, -1, 80
                Backstage passes to a TAFKAL80ETC concert, 4, 38
                Backstage passes to a TAFKAL80ETC concert, -1, 0
                Backstage passes to a TAFKAL80ETC concert, -6, 0

                """;
        assertEquals(expected, outputStream.toString());
    }
}