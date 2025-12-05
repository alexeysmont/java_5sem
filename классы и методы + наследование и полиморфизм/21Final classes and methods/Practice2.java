final class FinalClass {
    public void show() {
        System.out.println("Final class method");
    }
}

// ошибка компиляции, нельзя наследовать от final-класса
// class ChildClass extends FinalClass {
//     public void childMethod() {
//         System.out.println("Child method");
//     }
// }

class NormalClass {
    public void show() {
        
        System.out.println("Normal class method");
    }
}

// можно наследовать от обычного класса
class ChildClass extends NormalClass {
    @Override
    public void show() {
        System.out.println("Child of normal class");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
        
        ChildClass child = new ChildClass();
        child.show();
    }
}