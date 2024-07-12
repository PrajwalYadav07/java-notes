package chapter3;

class demo {
    int x, y;

    void setData(int a, int b) {
        x = a;
        y = b;
    }

    demo CopyData(demo p) {
        demo obj = new demo();
        obj.x = p.x;
        obj.y = p.y;
        return obj;
    }
    void printData()
    {
        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
    }
}

public class ObjArgument {
    public static void main(String []args)
    {
        demo d1 = new demo();
        demo d2 = new demo();
        d1.setData(10,20);
        d2 = d2.CopyData(d1);
        d1.printData();
        d2.printData();
    }
}
