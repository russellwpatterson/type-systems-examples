package example2_java;

import static java.lang.System.out;

public class Example2 {
    public static void main(String[] args) {
        out.println("\nGood casting result:");
        out.println("--------------------");
        goodCasting();

        out.println("\nBad casting result:");
        out.println("-------------------");
        badCasting();

        out.println("\nGood downcasting result:");
        out.println("------------------------");
        goodDowncasting();

        out.println("\nBad downcasting result:");
        out.println("-----------------------");
        badDowncasting();
    }

    static void goodCasting() {
        try {
            Cat animal = new Cat();
            Animal cat = (Animal)animal;
            cat.makeSound();
        } catch (Exception e) {
            out.println(e);
        }
    }

    static void badCasting() {
        try {
            //Cat cat = new Animal();
            Cat cat = (Cat)new Animal();
            cat.makeSound();
        } catch (Exception e) {
            out.println(e);
        }
    }

    static void goodDowncasting() {
        try {  
            Animal animal = new Dog();
            Dog dog = (Dog)animal;
            dog.makeSound();
        } catch (Exception e) {
            out.println(e);
        }
    }

    static void badDowncasting() {
        try {  
            Animal animal = new Animal();
            // Dog dog = animal;
            Dog dog = (Dog)animal;
            dog.makeSound();
        } catch (Exception e) {
            out.println(e);
        }
    }
}

class Animal {
    void makeSound() {
        out.println("Generic animal noise.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        out.println("Bark, bark.");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        out.println("Meow, meow.");
    }
}