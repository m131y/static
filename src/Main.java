class Person {
    public static void greet() {
        System.out.println("Hello from static method!");
    }

    public void sayHello() {
        System.out.println("Hello from instance method!");
    }
}

public class Main {
    public static void main(String[] args) {
        Person.greet(); // 인스턴스 없이 호출 가능

        Person p = new Person();
        p.sayHello();
    }
}