package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        }
        else {
            System.out.println(a + " is greater than " + b);
        }

    }
}
