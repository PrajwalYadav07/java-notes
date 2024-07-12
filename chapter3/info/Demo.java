package info;

import information.*; //import all classes of package
//import information.Test; //import selective class

public class Demo{
    public static void main(String []args)
    {
        Test t = new Test(); //this method is used when first two package import method are applied.
        // information.Test t = new information.Test(); //fully qualified name
        t.message();
    }
}
