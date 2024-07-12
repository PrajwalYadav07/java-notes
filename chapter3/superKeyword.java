package chapter3;

class student1
{
    protected int x,y;
    student1(int a)
    {
        x=a;
    }
    void printData()
    {
        System.out.println(x);
        System.out.println(y);

    }
}
class student2 extends student1
{
    protected int z;
    student2(int p,int q,int r)
    {
        super(p); //for constructor
        super.y = q; //for variable
        z=r;
    }
    void printingData()
    {
        super.printData(); //for method
        System.out.println(z);
    }
}
public class superKeyword {
    public static void main(String []args)
    {
        student2 obj = new student2(20,30,40);
        obj.printingData();
    }
}
