class A {
    int a;
    int b;
    int c;
    int z;
    
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
        A obj2 = new A(1);
        A obj3 = new A(1, 2);
        A obj4 = new A(1, 2, 3);
        
        System.out.println("obj1: " + obj1.a + "," + obj1.b + "," + obj1.c);
        System.out.println("obj2: " + obj2.a + "," + obj2.b + "," + obj2.c);
        System.out.println("obj3: " + obj3.a + "," + obj3.b + "," + obj3.c);
        System.out.println("obj4: " + obj4.a + "," + obj4.b + "," + obj4.c);
    }
}