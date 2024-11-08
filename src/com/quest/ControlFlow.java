package com.quest;

public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;
        if (num > 10) {
            System.out.println("number is a negative num" + num);
        } else if (num == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("number is a positive num" + num);
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        testForLoop();
        testWhileLoop();
    }

    private static void testForLoop() {
        for (int i = 0; i < 21; i++)
        {
            if(i%2==0)
            {
                System.out.println("even no"+i);
            }else{
                continue;
            }
        }
    }

    private static void testWhileLoop() {
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }


    }

