package practice_task;

import java.util.Scanner;

public class PalinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0) {
            int digit = num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("number is a palindrome.");
        }
        else {
            System.out.println("number is not a palindrome.");
        }
    }
}
