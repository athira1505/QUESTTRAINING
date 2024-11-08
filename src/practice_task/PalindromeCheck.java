package practice_task;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if(s==null)
        {
            System.out.println("String is null");
        }
        StringBuilder sb=new StringBuilder(s);
        StringBuilder reverse=sb.reverse();
        String reversed=reverse.toString();
        if(s.equals(reversed))
        {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}
