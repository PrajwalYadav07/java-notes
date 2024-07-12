package chapter5;

import java.io.*;

public class readFile {
    public static void main(String[] args) {
        try {
            BufferedReader fp = new BufferedReader(new FileReader("input.txt"));
            String data;
            while((data = fp.readLine()) != null)
            {
                System.out.println(data);
            }
            fp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}