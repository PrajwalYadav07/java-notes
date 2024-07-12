package chapter3;

class objfunctions
{
    private int id;
    private String name;
    objfunctions(int i, String n)
    {
        id = i;
        name = n;
    }
    public String toString()
    {
        return "ID : "+id+" & Name : "+name;
    }
    public boolean equals(Object obj)
    {
        objfunctions obj1 = (objfunctions) obj;
        return id == obj1.id;
    }
}
public class ObjectClass {
    public static void main(String []args)
    {
        objfunctions obj1 = new objfunctions(10,"krishna");
        objfunctions obj2 = new objfunctions(20,"shiv");
        objfunctions obj3 = new objfunctions(10,"krish");
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
    }
}
