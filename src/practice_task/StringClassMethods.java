package practice_task;

public class StringClassMethods {
    public static void main(String[] args) {
        String s="Athira";
        System.out.println(s);
        System.out.println(s.toUpperCase()); //ATHIRA
        System.out.println(s.toLowerCase()); //athira

        System.out.println(s.startsWith("s"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,2));

        String str="athira";
        System.out.println(s.equals(str));
        System.out.println(s.equalsIgnoreCase(s));
        System.out.println(s==str);

        String str1=new String("athira");
        String str2=new String("athira");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str));
        System.out.println(str1==str2);

        String s1="simple program";
        System.out.println("original string is: " +s1);
        String replace=s1.replace("simple","difficult");
        System.out.println( " replaced string is: " +replace);

        System.out.println(s.concat(str));
        System.out.println(s.indexOf("t"));
        System.out.println(s1.indexOf("program"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.isEmpty());

        String word="   hello!     ";
        System.out.println(word);
        System.out.println(word.trim());

    }
}
