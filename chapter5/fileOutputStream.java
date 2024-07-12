package chapter5;

import java.io.*;
public class fileOutputStream {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fp = new FileOutputStream("test.txt");
            String msg = "Good Morning";
            byte [] mb = msg.getBytes();
            fp.write(mb);
            fp.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
