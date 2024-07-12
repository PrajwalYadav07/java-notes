package chapter5;

import java.io.*;

public class writeFile {
    public static void main(String[] args) {
        try {
            BufferedWriter fp = new BufferedWriter(new FileWriter("input.txt"));
            fp.write("One");
            fp.newLine();
            fp.write("Two");
            fp.newLine();
            fp.write("Three");
            fp.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
