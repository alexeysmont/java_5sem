// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

// Производные классы
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Пример использования с соблюдением LSP
public class Main {
    public static void main(String[] args) {
        // Можем спокойно подставлять любых наследников
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        
        animal1.makeSound(); // Woof!
        animal2.makeSound(); // Meow!
        animal3.makeSound(); // Some animal sound
    }
    
    // Метод работает с любым Animal и его наследниками
    public static void animalConcert(Animal animal) {
        animal.makeSound(); // Корректно для любого наследника
    }
}