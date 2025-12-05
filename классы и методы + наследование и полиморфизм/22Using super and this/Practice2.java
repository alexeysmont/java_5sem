class A {
    int a = 10;
    
    void method() {
        System.out.println("A.method(), a = " + a);
    }
}

class B extends A {
    // не определяем переменную a и метод method()
    // они наследуются от класса A
}

class C extends B {
    void method() {
        // обращение к полю и методу класса A через super
        // даже если они не определены в B
        int a = super.a; // получаем поле из класса A
        super.method(); // вызываем метод из класса A
        
        System.out.println("C.method(), a from A = " + a);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}