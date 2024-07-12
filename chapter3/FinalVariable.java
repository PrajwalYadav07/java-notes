package chapter3;

class Test_1
{
    final int a = 55; // can not modify these variable
    void PrintData()
    {
        //a = 100; // can not modify
        System.out.println(a);
    }
}
public class FinalVariable {
    public static void main(String []args) {
        Test_1 t = new Test_1();
        t.PrintData();
    }
}

