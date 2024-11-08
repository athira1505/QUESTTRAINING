package com.quest;

public class PracticeVars {
    final  static int VOTE_AGE=20;
    public static void main(String[] args)
    {
        int age=10;
        double salary=1000.00;
        char gender='F';
        String firstName="john";
        String lastName="doe";
        System.out.println("age="+age);
        System.out.println("salary="+salary);
        System.out.println("gender="+gender);
        System.out.println("firstname="+firstName);

        age=18;
        System.out.println("age="+age);
        System.out.println("vote age="+VOTE_AGE);
        // vote age cannot be changed because it VOTE_AGE is final
        stringConcatenation();
        practiceConversion();
        stringMethods();
    }
    private static void practiceConversion()
    {
        int a=20;
        double b=25.5;
        double sum=a+b;
        int round=(int)b;
        System.out.println("sum="+sum);
        System.out.println("round="+round);
    }
    private static void stringConcatenation()
    {
       String s1="john";
       String s2="doe";
       String s3=s1+" "+s2;
        System.out.println(s3);
        int age=20;
        System.out.println("name="+s3+" age="+age);

    }
    private static void stringMethods()
    {
        String s1="john";
        String s2="doe";
        String s3=new String("hello world");
        String s4=new String("hello world");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);

    }
}
