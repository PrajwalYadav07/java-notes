package chapter4;
import java.io.IOException;

public class throwsKeyword {
    public static void main(String []args) throws IOException {
        System.out.print("Enter a character :");
        char c = (char)System.in.read();
        if(c == 'p' || c == 'P')
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
