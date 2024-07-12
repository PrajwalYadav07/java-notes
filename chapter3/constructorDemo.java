package chapter3;

class student
{
    int roll,mark;
    student() //Default Constructor
    {
        roll = 12;
        mark = 99;
    }
    student(int r, int m) //Parameterized Constructor
    {
        roll = r;
        mark = m;
    }
    student(student s) //Copy Constructor
    {
        roll = s.roll;
        mark = s.mark;
    }
    void printData()
    {
        System.out.println("Roll No.: "+ roll);
        System.out.println("Mark: "+mark);
    }
}

public class constructorDemo {
    public static void main(String []args)
    {
        student s1 = new student();
        student s2 = new student(11,87);
        student s3 = new student(s1);
        s1.printData();
        s2.printData();
        s3.printData();
    }
}
