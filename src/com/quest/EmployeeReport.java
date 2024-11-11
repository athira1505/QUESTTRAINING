package com.quest;

import java.util.Scanner;

public class EmployeeReport {
    final static int MAX_PAY=100000; // fix max pay as final
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of employees:");
        int n = sc.nextInt();

        //class Employee is created with all necessary fields
        class Employee {
            String name;
            int baseSalary;
            int m1;
            int m2;
            int m12;
            int bonus;
        }

        //declaring an array to store each employee's details
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {

            Employee e = new Employee();
            System.out.print("Enter the name of employee: " + (i + 1));
            e.name = sc.next();
            System.out.print("Enter the base salary for " + e.name + ":");
            e.baseSalary = sc.nextInt();
            if(!validation(e.baseSalary))
            {
                System.out.println("Please enter a valid score between 0 and 100000 ");
                e.baseSalary = sc.nextInt();
            }
            System.out.print("Enter salary for Month 1:");
            e.m1 = sc.nextInt();
            if(!validation(e.m1))
            {
                System.out.println("Please enter a valid score between 0 and 100000 ");
                e.m1 = sc.nextInt();
            }
            System.out.print("Enter salary for Month 2:");
            e.m2 = sc.nextInt();
            if(!validation(e.m2))
            {
                System.out.println("Please enter a valid score between 0 and 100000 ");
                e.m2 = sc.nextInt();
            }
            System.out.print("Enter salary for Month 12:");
            e.m12 = sc.nextInt();
            if(!validation(e.m12))
            {
                System.out.println("Please enter a valid score between 0 and 100000 ");
                e.m12 = sc.nextInt();
            }
            employees[i] = e;  //each employee's detail will be stored in array

        }
        System.out.println("---Employee Salary Report---");
        int totalAvgSalary = 0;
        for (int i = 0; i < n; i++) {
            Employee e = employees[i]; //employee's details  from array is used
            System.out.println("Employee Name: " + e.name);
            System.out.println("Base Salary: " + e.baseSalary);
            System.out.println("Monthly Salary Breakdown:");
            System.out.println("  Month 1: " + e.m1);
            System.out.println("  Month 2: " + e.m2);
            System.out.println("  Month 12: " + e.m12);
            int avgSalary = (e.m1 + e.m2 + e.m12) / 3;
            int total = avgSalary * 12;
            e.bonus = (int) (0.1 * e.baseSalary);
            System.out.println("Total Salary of the year: " + total);
            System.out.println("Average Monthly Salary: " + avgSalary);
            System.out.println("Bonus: " + e.bonus);
            totalAvgSalary += avgSalary; //to calculate total average salary of the employee's
        }
        System.out.println("\nAverage Salary for All Employees: " + totalAvgSalary / 2);

        System.out.println("\nThank you for using the Employee Salary Management System");
    }
    //to check whether pay is within the range of 0 to 100000
    private static boolean validation(int pay) {
        return pay >=0 && pay <= MAX_PAY;

    }
}


