package chapter3;

class findArea
{
    int area(int l)
    {
        return (l * l);
    }
    int area(int l, int b)
    {
        return (l * b);
    }
    double area(double r)
    {
        return (3.14 * r * r);
    }
}
public class methodOverloading {
    public static void main(String []args)
    {
        findArea f1 = new findArea();
        System.out.println("Area of square is : "+f1.area(10));
        System.out.println("Area of rectangle is : "+f1.area(10,20));
        System.out.println("Area of circle is : "+f1.area(10.0));
    }
}

//output