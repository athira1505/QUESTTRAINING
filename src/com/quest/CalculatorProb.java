package com.quest;

import java.util.Scanner;

public class CalculatorProb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        double result = sc.nextDouble();
        boolean iterate = true;
        while (iterate) {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square Root");
            System.out.println("6.Clear current result");
            System.out.println("7.Exit");
            System.out.println("Enter your choice(1-7)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the  number to add: ");
                    int b = sc.nextInt();
                    result += b;
                    break;
                case 2:
                    System.out.println("Enter the  number to subtract: ");
                    int c = sc.nextInt();
                    result -= c;
                    break;
                case 3:
                    System.out.println("Enter the  number to multiply: ");
                    int d = sc.nextInt();
                    result *= d;
                    break;
                case 4:
                    System.out.println("Enter the  number to divide: ");
                    int e = sc.nextInt();
                    if (e == 0) {
                        System.out.println("Enter a non zero number ");
                    }
                    result /= e;
                    break;
                case 5:
                    if (result > 0) {
                        result = Math.sqrt(result);
                    } else {
                        System.out.println("Enter positive no ");
                    }
                    break;
                case 6:
                    System.out.println("clear result ");
                    result = 0;
                    break;
                case 7:
                    System.out.println("Do you want to continue?(enter y/n): ");
                    char ch = sc.next().charAt(0);
                    if (ch == 'n') {
                        iterate = false;
                        System.exit(0);
                    } else {
                        System.out.println("Enter the no:");
                        result = sc.nextDouble();
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println("The current result is: " + result);


        }
    }

}
