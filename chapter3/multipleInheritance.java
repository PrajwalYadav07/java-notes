package chapter3;

interface vehicle
{
    void nameOfVehicle(String n);
}
interface measurments
{
    void mileage(double m);
}
class cars implements vehicle,measurments
{
    public void nameOfVehicle(String name)
    {
        System.out.println("Name of car is : " +name);
    }
    public void mileage(double m)
    {
        System.out.println("Mileage is : "+m);
    }
}
public class multipleInheritance {
    public static void main(String []args)
    {
        cars c = new cars();
        c.mileage(8.5);
        c.nameOfVehicle("Jaguar");
    }
}
