package chapter5;

import java.io.*;
<
public class readWriteFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String data;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
