package com.devtalles.exception.basic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void recursive() {
        recursive();
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("The result of the operation is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("The operation just failed: " + e.getMessage());
        } finally {
            System.out.println("The operation has been executed.");
        }
    }
}