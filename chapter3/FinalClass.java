package chapter3;

final class Test_3 // can not inherit these class
{
    int a = 55;
    void PrintData()
    {
        a = 100;
        System.out.println(a);
    }
}
public class FinalClass // extends Test_3
{
    public static void main(String []args) {
        Test_3 t = new Test_3();
        t.PrintData();
    }
}
