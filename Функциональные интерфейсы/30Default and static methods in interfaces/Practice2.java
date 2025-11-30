interface InterfaceA {
    default void sameMethod() {
        System.out.println("Method from InterfaceA");
    }
}

interface InterfaceB {
    default void sameMethod() {
        System.out.println("Method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    //переопределяем конфликтующий метод
    @Override
    public void sameMethod() {
        InterfaceA.super.sameMethod(); // вызываем конкретную реализацию
        //или пишем свою реализацию
    }
}

public class Practice2 {
    public static void main(String[] args) {
        new MyClass().sameMethod();
    }
}