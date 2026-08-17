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
            e.printStackTrace();
        } finally {
            System.out.println("The operation has been executed.");
        }

        try {
            int[] numbers = new int[3];
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.println("Class: " + stackTraceElement.getClassName());
                System.out.println("Method: " + stackTraceElement.getMethodName());
                System.out.println("Line: " + stackTraceElement.getLineNumber());
                System.out.println("File: " + stackTraceElement.getFileName());
            }
        }
    }
}