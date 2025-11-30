class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// пример LSP
public class Main {
    public static void main(String[] args) {
      
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        
        animal1.makeSound(); // Woof
        animal2.makeSound(); // Meow
        animal3.makeSound(); // Some animal sound
    }
    

    public static void animalConcert(Animal animal) {
        animal.makeSound(); // работает для любого наследника
    }
}