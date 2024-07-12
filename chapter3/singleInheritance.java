package chapter3;

class A
{
    protected int x;
    A(int a)
    {
        x=a;
    }
}
class B extends A
{
    protected int y;
    B(int p,int q)
    {
        super(p);
        y=q;
    }
    void printData()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
public class singleInheritance {
    public static void main(String []args)
    {
        B obj = new B(20,30);
        obj.printData();
    }
}
