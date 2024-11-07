package ru.mirea.task20.opt3;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T min = array[0];
        for (T item : array) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T getMax() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 7, 2};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());

        String[] strArray = {"apple", "banana", "cherry"};
        MinMax<String> minMaxStr = new MinMax<>(strArray);
        System.out.println("Min: " + minMaxStr.getMin());
        System.out.println("Max: " + minMaxStr.getMax());
    }
}