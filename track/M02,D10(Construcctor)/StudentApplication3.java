
public class Student3 {

    String name;
    int age;
    double height;

    Student3() {
        name = "Anu";
        age = 18;
        height = 5.0;
    }

    Student3(String name) {
        this.name = name;
    }

    Student3(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplication3 {

    public static void main(String[] args) {
        Student3 s1 = new Student3("Raja", 18, 5.0);
        s1.display();
        Student3 s2 = new Student3();
        s2.display();
        Student3 s3 = new Student3("Manu");
        s3.display();
    }
}
