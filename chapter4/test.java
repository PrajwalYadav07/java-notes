package chapter4;
import java.io.IOException;
import java.lang.*;

public class test extends Thread
{
    public void run()
    {
        System.out.println("start");
        throw new RuntimeException();
    }
}
class Exceptionthread
{
    public static void main(String[] args) {
        test t=new test();
        t.start();
        try
            {
                Thread.sleep(1000);
            }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
