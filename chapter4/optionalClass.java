package chapter4;

import java.util.Optional;

public class optionalClass {
    public static void main(String []args)
    {
        String s1 = "Hello";
        String s2 = null;

        Optional<String> op1 = Optional.ofNullable(s1);
        Optional<String> op2 = Optional.ofNullable(s2);

        System.out.println(op1.orElse("not present"));
        System.out.println(op2.isPresent()?op2.get():"not present");

        System.out.println(op1.map(String::toUpperCase).orElse("Default"));
        System.out.println(op2.map(String::toUpperCase).orElse("Default"));

        op1.ifPresent(s-> System.out.println("Value is present: "+s));
        op2.ifPresent(s-> System.out.println("Value is present: "+s));

    }
}
