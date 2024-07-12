package chapter3;

public class StringClass {
    public static void main(String []args)
    {
        String s1 = "Hello Indians";
        System.out.println(s1.length());
        System.out.println(s1.charAt(7));
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        s1 = s1.replace("Hello","Good");
        System.out.println(s1);
        System.out.println(s1.contains("Hello"));
        char []s2 = new char[10];
        s1.getChars(1,6,s2,2);
        System.out.println(s2);
        String s3 = "Good Morning";
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println(s1.compareTo(s3));// 0->s1==s3, +ve->s1>s3, -ve->s1<s3
        String s4 = String.format("Hello %d Persons %s",10,"hindu");
        System.out.println(s4);
        String []s5 = s4.split(" ");
        for(String word : s5)
        {
            System.out.println(word);
        }
    }
}
//output
//13
//n
//Indians
//Hello
//HELLO INDIANS
//hello indians
//Good Indians
//false
//  ood I
//false
//false
//-4
//Hello 10 Persons hindu
//Hello
//10
//Persons
//hindu