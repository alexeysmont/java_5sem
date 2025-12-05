class A {
    int a1;           // package-private
    public int a2;    // public
    protected int a3; // protected
    private int a4;   //private
    
    void method1() { System.out.println("A: package-private method1"); }
    public void method2() { System.out.println("A: public method2"); }
    protected void method3() { System.out.println("A: protected method3"); }
    private void method4() { System.out.println("A: private method4"); }
}

class B extends A {
    void testB() {
        a1 = 1;    // доступно 
        a2 = 2;    //доступно
        a3 = 3;    // доступно
        // a4 = 4; //недоступно 
        
        method1(); //доступно
        method2(); // доступно  
        method3(); // доступно
        // method4(); // недоступно
    }
}

class C extends B {
    void testC() {
        a1 = 1;    // доступно
        a2 = 2;    // доступно
        a3 = 3;    // доступно
        // a4 = 4; // недоступно
        
        method1(); // доступно
        method2(); //доступно
        method3(); // доступно
        // method4(); // недоступно
    }
}

public class Practice2 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        
        b.a1 = 10;    // в том же пакете
        b.a2 = 20;    // всегда
        b.a3 = 30;    //в том же пакете или подклассе
        // b.a4 = 40; // никогда
        
        b.method1();  // в том же пакете
        b.method2();  // всегда
        b.method3();  // в том же пакете или подклассе
        // b.method4(); //никогда
    }
}