package chapter3;

import java.util.Scanner;

interface MathOperation
{
    int operation(int a, int b);
}
public class lambdaExpression {
    public static void main(String []args)
    {
        MathOperation add = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        MathOperation sub = (int a, int b) -> a-b;
        System.out.println(add.operation(10,5));
        System.out.println(sub.operation(10,5));
    }
}
//output
//15
//5