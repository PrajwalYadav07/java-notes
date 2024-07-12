package chapter3;

class Test
{
    int roll_no;
    String name;
    void getData(int rollno, String name)
    {
        this.roll_no = rollno;
        this.name = name;
    }
    void PrintData()
    {
        System.out.println("Roll No. : "+ roll_no);
        System.out.println("Name : "+name);
    }
}
public class ThisKeyword {
    public static void main(String []args) {
        Test t = new Test();
        t.getData(1,"shiv");
        t.PrintData();
    }
}

//output

//Roll No. : 1
//Name : shiv

//Process finished with exit code 0
