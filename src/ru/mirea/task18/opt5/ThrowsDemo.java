package ru.mirea.task18.opt5;

public class ThrowsDemo {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}