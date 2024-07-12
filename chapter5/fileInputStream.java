package chapter5;

import java.io.*;

public class fileInputStream {
    public static void main(String[] args) {
        try
        {
            FileInputStream fp = new FileInputStream("test.txt");
            int data;
            while((data = fp.read()) != -1)
            {
                System.out.print((char)data);
            }
            fp.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
