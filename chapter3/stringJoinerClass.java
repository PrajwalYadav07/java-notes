package chapter3;

import java.util.StringJoiner;

public class stringJoinerClass {
    public static void main(String []args)
    {
        StringJoiner sj = new StringJoiner("/","(",")");
        sj.add("one");
        sj.add("two");
        sj.add("three");
        //System.out.println(sj);
        String s1 = sj.toString();
        System.out.println(s1);
    }
}
