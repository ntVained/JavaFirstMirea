package ru.mirea.task20.opt1;

public class GenericClass<T, V, K> {
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
        GenericClass<String, Integer, Double> obj = new GenericClass<>("Hello", 123, 45.67);
        obj.printClassNames();
    }
}