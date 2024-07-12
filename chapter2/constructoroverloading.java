package chapter2;
class Add {
    int x = 10;
    Add() {
        System.out.println(x);
    }
    Add(int y) {
        System.out.println(x+y);
    }
    Add(int y, int z) {
        System.out.println(x+y+z);
    }
}

public class constructoroverloading {
    public static void main(String[] args) {
        Add obj = new Add();
        Add obj2 = new Add(10);
        Add obj3 = new Add(10,20);
    }
}
