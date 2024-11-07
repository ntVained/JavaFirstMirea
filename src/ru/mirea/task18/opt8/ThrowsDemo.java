package ru.mirea.task18.opt8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                String key = myScanner.next();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Caught: " + e.getMessage());
                System.out.println("Please enter a valid key.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}