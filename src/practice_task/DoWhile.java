package practice_task;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);

        revDigits();
        sumDigits();
        palinNo();
        primeNum();

    }
    private static void revDigits()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        int n = sc.nextInt();
        int sum=0;
        do{
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }while(n!=0);
        System.out.println("reverse is:"+sum);
    }
    private static void sumDigits()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find sum of digits:");
        int n = sc.nextInt();
        int sum=0;
        do{
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }while(n!=0);
        System.out.println("sum of digits is:"+sum);
    }
    private static void palinNo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();
        int rev=0;
        int temp=num;
        do{
            int digit = num%10;
            rev=rev*10+digit;
            num=num/10;
        }while(num!=0);
        if(rev==temp)
        {
            System.out.println("number is a palindrome.");
        }
        else {
            System.out.println("number is not a palindrome.");
        }
    }
    private static void primeNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        int i=2;
        do
        {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }while (i<num);
        if(isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }

}
