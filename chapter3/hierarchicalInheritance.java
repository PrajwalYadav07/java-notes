package chapter3;

class AAA
{
    protected int x;
    AAA(int a)
    {
        x=a;
    }
}
class BBB extends AAA
{
    protected int y;
    BBB(int a, int b)
    {
        super(a);
        y=b;
    }
    void printData()
    {
        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
    }
}

class CCC extends AAA
{
    protected int z;
    CCC(int p, int q)
    {
        super(p);
        z=q;
    }
    void printData()
    {
        System.out.println("Value of x is : "+x);
        System.out.println("Value of z is : "+z);
    }
}
public class hierarchicalInheritance {
    public static void main(String []args)
    {
        BBB obj1 = new BBB(20,30);
        obj1.printData();
        CCC obj2 = new CCC(50,60);
        obj2.printData();
    }
}
