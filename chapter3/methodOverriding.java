package chapter3;

class shine
{
    void average()
    {
        System.out.println("Around 60");
    }
}
class passion extends shine
{
    void average()
    {
        System.out.println("Around 55");
    }
}
public class methodOverriding {
    public static void main(String []args)
    {
        shine s = new shine();
        s.average();
        passion p = new passion();
        p.average();
    }
}
