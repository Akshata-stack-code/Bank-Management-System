
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "ajya";
        s1.height = 5.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
