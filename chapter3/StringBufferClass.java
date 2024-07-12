package chapter3;

public class StringBufferClass {
    public static void main(String []args)
    {
        String s1 = "Vadapav";
        s1.concat("Dabeli");
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Vadapav ");
        sb.append("Dabeli");
        System.out.println(sb);
        sb.insert(7," Marchu");
        System.out.println(sb);
        sb.replace(8,14,"sauce");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}