class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
