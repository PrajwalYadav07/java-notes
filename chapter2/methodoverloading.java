package chapter2;
class Area {
    int area(int l) {
        return l * l;
    }

    int area(int l, int b) {
        return l * b;
    }

    double area(double r) {
        return 3.1415*r*r;
    }
}

class methodoverloading {
    public static void main(String[] args) {
        Area A = new Area();
        System.out.println("Area of Square is : " +A.area(20));
        System.out.println("Area of Rectangle is : " + A.area(10,20));
        System.out.println("Area of Circle is : " + A.area(10.0));
    }
}