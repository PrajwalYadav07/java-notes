package chapter3;

interface vehicles
{
    void nameOfVehicle(String n);
}
interface measurment
{
    void mileage(double m);
}
class car implements vehicles, measurment
{
    protected int x;
    car(int a)
    {
        x = a;
    }
    public void nameOfVehicle(String name)

    {
        System.out.println("Name of car is : " +name);
    }
    public void mileage(double m)
    {
        System.out.println("Mileage is : "+m);
    }
}
class supercar extends car
{
    protected int y;
    supercar(int p,int q)
    {
        super(p);
        y=q;
    }
    void printData()
    {
        System.out.println("Value of x is : "+x);
        System.out.println("Value of x is : "+y);
    }
}
public class hybridInheritance {
    public static void main(String []args)
    {
        supercar c = new supercar(10,11);
        c.mileage(8.5);
        c.nameOfVehicle("Jaguar");
        c.printData();
    }
}
