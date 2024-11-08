package practice_task;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of series: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        int first=0;
        int second=1;
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int third=first+second;
            first=second;
            second=third;}
    }
}
