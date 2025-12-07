class A {
    int a, b, c, z;
    
    public A() {
        this(0, 0, 0);
    }
    
    public A(int a) {
        this(a, 0, 0);
    }
    
    public A(int a, int b) {
        this(a, b, 0);
    }
    
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(5);
        A obj3 = new A(5, 10);
        A obj4 = new A(5, 10, 15);
    }
}