public class Practice1 {
    public static void main(String[] args) {
        A obj1 = new A();           // через конструктор
        A obj2 = new A(20);         // через параметризованный конструктор
        A obj3 = new A(true);       // через условную логику в конструкторе
    }
}

class A {
    public final int a;
    
    //инициализация в конструкторе
    public A() {
        this.a = 10;
    }
    
    //инициализация в параметризованном конструкторе
    public A(int value) {
        this.a = value;
    }
    
    //инициализация в блоке инициализации
    
    {
        System.out.println("Блок инициализации выполнен");
    }
    
    // через условную логику в конструкторе
    public A(boolean flag) {
        if (flag) {
            this.a = 100;
        } else {
            this.a = 200;
        }
    }
}