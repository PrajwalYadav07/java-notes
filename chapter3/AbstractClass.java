package chapter3;

abstract class animal
{
    void message()
    {
        System.out.println("From class animal");
    }
    abstract void sound();
}
class dog extends animal
{
    void sound()
    {
        System.out.println("Bhau Bhau");
    }
}
public class AbstractClass {
    public static void main(String []args)
    {
       //animal a =new animal();
        dog d = new dog();
        d.sound();
    }
}
//output
//Bhau Bhau
