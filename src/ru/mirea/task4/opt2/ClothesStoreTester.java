package ru.mirea.task4.opt2;

public class ClothesStoreTester {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 500, "Белый"),
                new Pants(Size.L, 1000, "Черный"),
                new Skirt(Size.S, 700, "Красный"),
                new Tie(Size.M, 300, "Синий")
        };

        Atelier.dressMan(clothes);

        Atelier.dressWomen(clothes);
    }
}
