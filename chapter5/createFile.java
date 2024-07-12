package chapter5;

import java.io.*;

public class createFile {
    public static void main(String []args)
    {
        try{
            File f = new File("demo.txt");
            System.out.println("File Created : "+f.createNewFile());
            f.delete();
            System.out.println("File Created : "+f.createNewFile());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
