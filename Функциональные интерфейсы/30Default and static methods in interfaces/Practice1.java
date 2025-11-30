interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }
    
    static void staticMethod() {
        System.out.println("Static method");
    }
}

class MyClass implements MyInterface {
    
}

public class Practice1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();          // вызов default метода через объект
        MyInterface.staticMethod();   //вызов static метода через интерфейс
    }
}