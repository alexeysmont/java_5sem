class A {
    static void method() { System.out.println("A"); }
}

class B extends A {
    static void method() { System.out.println("B"); } // скрытие, не переопределение
}

public class Practice1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.method(); // вызовется A.method(), а не B.method()
        
        B obj2 = new B();
        obj2.method(); // вызовется B.method()
    }
}