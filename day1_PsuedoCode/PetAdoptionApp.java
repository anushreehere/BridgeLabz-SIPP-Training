// PetAdoptionApp.java
class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
    }
}

class Dog extends Pet {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Pet {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

class Bird extends Pet {
    String species;

    Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Species: " + species);
    }
}

public class PetAdoptionApp {
    public static void main(String[] args) {
        Pet dog = new Dog("Bruno", 3, "Labrador");
        Pet cat = new Cat("Kitty", 2, "White");
        Pet bird = new Bird("Mithu", 1, "Parrot");

        dog.displayInfo();
        cat.displayInfo();
        bird.displayInfo();
    }
}

