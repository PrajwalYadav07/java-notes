package chapter3;

class AA
{
    protected int x;
    AA(int a)
    {
        x=a;
    }
}
class BB extends AA
{
    protected int y;
    BB(int a, int b)
    {
        super(a);
        y=b;
    }
}

class CC extends BB
{
    protected int z;
    CC(int p,int q,int r)
    {
        super(p,q);
        z=r;
    }
    void printData()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class multilevelInheritance {
    public static void main(String []args)
    {
        CC obj = new CC(20,30,40);
        obj.printData();
    }
}