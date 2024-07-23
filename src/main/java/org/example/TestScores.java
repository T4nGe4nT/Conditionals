package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100: ");
        int number = scanner.nextInt();

        switch (number/10) {
            case 5:
                System.out.println("Your grade is a F :(");
                break;
            case 6:
                System.out.println("Your grade is a D.");
                break;
            case 7:
                System.out.println("Your grade is a C.");
                break;
            case 8:
                System.out.println("Your grade is a B.");
                break;
            case 9:
                System.out.println("Your grade is an A.");
                break;
            default:
                System.out.println("Your grade is a SUPER F! :(");
                break;

        }
    }
}
