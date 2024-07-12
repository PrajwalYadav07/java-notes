package chapter4;
class student extends Exception
{
    public String toString()
    {
        return "Mark is less than zero";
    }
}
class userDefinedException
{
    static void result(int a, int b) throws student
    {
        if(a<0 || b<0)
        {
            throw new student();
        }
        else
        {
            System.out.println("Total marks is:"+(a+b));
        }
    }
    public static void main(String []args)
    {

        try {
            result(10,20);
        } catch (student e) {
            System.out.println(e);
        }
    }
}
