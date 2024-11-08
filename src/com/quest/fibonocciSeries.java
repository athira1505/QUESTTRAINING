package com.quest;

import java.util.Scanner;

public class fibonocciSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of series: ");
        n=sc.nextInt();
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
