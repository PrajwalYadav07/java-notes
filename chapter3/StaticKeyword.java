package chapter3;

class corona
{
    static int count;
    static {
        System.out.println("In static block");
    }
    void change()
    {
        count++;
    }
    static void printCount()
    {
        System.out.println(count);
    }
}
public class StaticKeyword {
    public static void main(String []args)
    {
        corona c1 = new corona();
        corona c2 = new corona();
        c1.change();
        c1.change();
        c1.change();
        c2.change();
        c1.printCount();
        c2.printCount();
        System.out.println(corona.count);//static variable
        corona.printCount();//static function
    }
}


//output

//In static block
//4
//4
//4
//4
//Process finished with exit code 0
