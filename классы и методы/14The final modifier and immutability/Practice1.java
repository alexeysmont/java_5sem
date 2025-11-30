public public class Practice1 {
    public static void main(String[] args) {
        A obj1 = new A();           // через конструктор
        A obj2 = new A(20);         // через параметризованный конструктор
        A obj3 = new A(true);       // через блок инициализации
    }
}

class A {
    public final int a;
    
    // Вариант 1: Инициализация при объявлении
    // public final int a = 10;
    
    // Вариант 2: Инициализация в конструкторе
    public A() {
        this.a = 10;
    }
    
    // Вариант 3: Инициализация в параметризованном конструкторе
    public A(int value) {
        this.a = value;
    }
    
    // Вариант 4: Инициализация в блоке инициализации
    {
        // this.a = 30; // раскомментировать для этого варианта
    }
    
    // Вариант 5: Через условную логику в конструкторе
    public A(boolean flag) {
        if (flag) {
            this.a = 100;
        } else {
            this.a = 200;
        }
    }
} Practice1 {
    
}
