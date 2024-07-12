package chapter4;

public class nestedTry {
    public static void main(String []args)
    {
        try {

            int[] a = {10, 20, 50, 0, 60};
            try {
                System.out.println(a[4] / a[0]);
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Index out of range");
        }
        finally {
            System.out.println("finally Done");
        }
    }
}
/*
compile time - syntax
run time (Exception) - filenotfound,zero division,name,type
logical - logic mistake
 */