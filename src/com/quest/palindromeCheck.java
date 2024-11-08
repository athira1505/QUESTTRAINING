package com.quest;

import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(str==null){
            System.out.println("The string is null");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse=sb.reverse();
        String reverseString=reverse.toString();
        if(str.equals(reverseString)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}
