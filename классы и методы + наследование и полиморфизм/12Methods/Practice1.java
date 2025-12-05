public class Practice1 {
    public static void main(String[] args) {
        // перегрузка методов
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.7));
        System.out.println(calc.add(2, 3, 4));

        // переопределение методов
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.sound(); 
        dog.sound();    
    }
}

// перегрузка методов
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
        
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// переопределение методов
class Animal {
    void sound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("woof");
    }
}