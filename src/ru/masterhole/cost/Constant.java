package ru.masterhole.cost;

/**
 * Автор viewsoul дата создания 10.03.2017.
 */
class Constant {

    // цвет, наценка в процентах
    static int[][] COLOR = {
            {Text.WHITE.hashCode(),     0,  0,  0},
            {Text.COLOR.hashCode(),     20, 17, 14},
            {Text.MATE_WHITE.hashCode(),15, 12, 9},
            {Text.MATE_COLOR.hashCode(),20, 17, 14},
            {Text.ANTIK.hashCode(),     25, 22, 19},
            {Text.METALIK.hashCode(),   25, 22, 19},
            {Text.CHROM.hashCode(),     30, 28, 26},
            {Text.GOLD.hashCode(),      30, 28, 26}
    };

    // грунтовка, наценка в процентах
    static int GRUNT = 10;

    // стоимость выреза в рублях
    static int VIREZ = 120;

    // стоимость упора в рублях
    static int UPOR = 50;
}
