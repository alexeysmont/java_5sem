public class Practice1 {
    public static void main(String[] args) {
        // через класс
        A.printVars();
        
        // через экземпляр класса
        A obj = new A();
        obj.printVars();
        
        // через наследованне 
        B b = new B();
        b.printVars(); 
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class B extends A {
    
}