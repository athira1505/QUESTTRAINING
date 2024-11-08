package com.quest;

import java.util.Scanner;

public class patternCheck {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
