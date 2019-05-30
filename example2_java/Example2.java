package example2_java;

import static java.lang.System.out;

public class Example2 {
    public static void main(String[] args) {
        // Inferred Type would be "Cat"
        var cat = new Cat();

        // We can reference an object by it's base class.
        Animal animal = new Cat();

        // It's not going to let us do this, because Cat is a derived class.
        // This blows up at compile time, not at runtime, because of static type checking.
        Cat cat2 = new Animal();

        // But we can do this explicit cast. The compiler will live with it, 
        // because you're trying really hard and it wants to reward that (with a runtime error).
        Cat cat3 = (Cat) new Animal();

        // Dog and Cat have a common base, but you can't implicitly cast between them.
        Dog dog = new Cat();
        Cat cat4 = new Dog();

        // The compiler won't let you do this, since they're not derived from each other.
        Dog dog2 = (Dog) new Cat();
        Cat cat5 = (Cat) new Dog();

        // Basically thanks to static type checking, we're avoiding some, but not all type problems at compile time.
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