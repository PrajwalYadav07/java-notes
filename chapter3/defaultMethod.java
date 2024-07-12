package chapter3;

interface fruits
{
    default void fresh()
    {
        System.out.println("Yes it is fresh");
    }
}
class mango implements fruits
{
}
class grapes implements fruits
{
    public void fresh()
    {
        System.out.println("it's not fresh");
    }
}
public class defaultMethod {
    public static void main(String []args)
    {
        mango m = new mango();
        grapes g = new grapes();
        m.fresh();
        g.fresh();
    }
}
//output
//Yes it is fresh
//it's not fresh