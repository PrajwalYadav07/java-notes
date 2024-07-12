package chapter3;

class Test_2
{
    int a = 55;
    final void PrintData() // can not override these function
    {
        a = 100;
        System.out.println(a);
    }
}
public class FinalMethod extends Test_2
{
//    void PrintData() // can not override these function
//    {
//        System.out.println(48756);
//    }

    public static void main(String []args)
    {
        Test_2 t = new Test_2();
        t.PrintData();
    }
}

