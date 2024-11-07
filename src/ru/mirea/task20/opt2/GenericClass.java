package ru.mirea.task20.opt2;

import java.io.Serializable;

class Animal implements Serializable {
}

class Dog extends Animal {
}

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClass<String, Dog, Integer> obj = new GenericClass<>("Hello", new Dog(), 123);
        obj.printClassNames();
    }
}