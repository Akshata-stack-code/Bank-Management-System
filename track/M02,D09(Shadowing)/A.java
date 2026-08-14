
class A {

    short m(short a, short b) {
        return a + b;
    }

    int m(int a, int c) {
        return a + c;
    }
}

class Aapplication {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m(10, 10));
    }
}
