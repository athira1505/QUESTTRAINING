package com.quest;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        int num,r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        temp = num;
        while(num!=0) {
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a palindrome number");
        }

    }
}
