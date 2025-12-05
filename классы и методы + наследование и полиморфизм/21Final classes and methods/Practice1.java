class Parent {
    public final void finalMethod() {
        System.out.println("Это final-метод");
    }
    
    public void normalMethod() {
        System.out.println("Обычный метод");
    }
}

class Child extends Parent {
    // ошибка комиляцииб нельзя переопределить final-метод
    // public void finalMethod() {
    //     System.out.println("Попытка переопределения");
    // }
    
    // можно переопределить обычный метод
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный метод");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.finalMethod(); 
        child.normalMethod();
    }
}