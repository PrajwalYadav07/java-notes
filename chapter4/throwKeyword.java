package chapter4;

public class throwKeyword {
    static void test(int a)
    {
        try {
            if(!(a>=8 && a<=16)) {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("Length should in between 8 to 16");
        }
        finally {
            System.out.println("OK");
        }
    }
    public static void main(String []args)
    {
           test(16);
    }
}
