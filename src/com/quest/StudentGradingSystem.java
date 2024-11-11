package com.quest;

import java.util.Scanner;

public class StudentGradingSystem {
    final static int MAX_SCORE = 100;  //fix max_score
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        // constructing class Student with required fields
        class Student {
            String name;
            float math;
            float science;
            float english;
            char grades;
        }
        for (int i = 0; i < n; i++) {
            Student s = new Student();        // create object s for class Student
            System.out.println("Enter student name: ");
            s.name = sc.next();
            System.out.println("Enter score of math: ");
            s.math = sc.nextFloat();

            //check  whether the entered num is valid
            if (!validation(s.math)) {
                System.out.println("Please enter a valid score between 0 and 100 ");
                s.science = sc.nextFloat();
            }


            System.out.println("Enter score of science: ");
            s.science = sc.nextFloat();

            //check validation
            if (!validation(s.science)) {
                System.out.println("Please enter a valid score between 0 and 100 ");
                s.science = sc.nextFloat();
            }

            System.out.println("Enter score of english: ");
            s.english = sc.nextFloat();

            //check validation
            if (!validation(s.english)) {
                System.out.println("Please enter a valid score between 0 and 100 ");
                s.english = sc.nextFloat();
            }
            if(s.math<60 ||s.english<60 || s.science<60)
            {
                System.out.println("Warning:Needs improvement in individual subjects");
            }

            float total = s.english + s.math + s.science;
            System.out.println("Total score: " + total);
            float avg = total / 3;
            System.out.println("Average score: " + avg);

            // Grading system using if else
            if (avg >= 90) {
                s.grades = 'A';
                System.out.println("Grade:"+s.grades);
            } else if (avg >= 80 && avg < 90) {
                s.grades = 'B';
                System.out.print("Grade:"+s.grades);

            } else if (avg >= 70 && avg < 80) {
                s.grades = 'C';
                System.out.print("Grade:"+s.grades);

            } else if (avg >= 60 && avg < 70) {
                s.grades = 'D';
                System.out.print("Grade:"+s.grades);
            } else {
                s.grades = 'F';
                System.out.print("Grade:"+s.grades);

            }

            // Feedback using switch for each case
            switch (s.grades) {
                case 'A':
                    System.out.print("\nExcellent performance!\n");
                    break;
                case 'B':
                    System.out.print("\n Good job, but you can aim higher!\n");
                    break;
                case 'C':
                    System.out.print("\nYou need to put in more effort!\n");
                    break;
                case 'D':
                    System.out.print("\nYour performance is below expectations. Consider seeking help.\n");
                    break;
                case 'F':
                    System.out.print("\nFailure. You need significant improvement.\n");
                    break;
                default:
                    System.out.print("\nWarning: Needs improvement in individual subjects.\n");
            }


        }

    }

    private static boolean validation(float marks) {
        return marks >= 0 && marks <= MAX_SCORE;

    }
}
