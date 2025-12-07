// Practice.java

// практика 1: interface Interface {...}
// область видимости: package-private (по умолчанию)
// доступен только классам в том же пакете

// практика 2: public interface Interface {...}
// область видимости: public
// доступен всем классам из любого пакета

// практика 3: protected interface Interface {...} - ошибка компиляции
// интерфейсы не могут быть protected или private
// допустимые модификаторы: public или по умолчанию (package-private)

// практика 4: private interface Interface {...} - ошибка компиляции
// интерфейсы не могут быть private
// интерфейс должен быть реализован, private запрещает доступ из других классов

interface ExampleInterface {
    int CONSTANT = 10; // public static final
    
    void method(); // public abstract
}

abstract class AbstractClass implements ExampleInterface {
    // Не реализует метод method()
    // Должен быть abstract
}

class ConcreteClass implements ExampleInterface {
    public void method() {
        System.out.println("CONSTANT = " + CONSTANT);
    }
}

public class Practice {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.method();
    }
}