package org.example;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("Enter another word:");
        String otherWord = scanner.nextLine();
        if (word.equals(otherWord)) {
            System.out.println("The words same.");
        } else {
            System.out.println("The words different.");

        }
    }
}
