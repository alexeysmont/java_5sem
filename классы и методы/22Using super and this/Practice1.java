class Parent {
    String name = "Parent";
    
    Parent() {
        System.out.println("Parent constructor");
    }
    
    Parent(String name) {
        this.name = name;
        System.out.println("Parent param: " + name);
    }
    
    void show() {
        System.out.println("Parent method: " + name);
    }
}

class Child extends Parent {
    String name = "Child";
    
    Child() {
        super(); // 1 обращение к конструктору суперкласса
        System.out.println("Child constructor");
    }
    
    Child(String name) {
        super(name); // 1 обращение к конструктору суперкласса с параметром
    }
    
    void demo() {
        System.out.println("super.name: " + super.name); // 2 доступ к полю суперкласса
        super.show(); // 3 доступ к методу суперкласса
    }
    
    @Override
    void show() {
        System.out.println("Child method: " + name);
        super.show(); // 3 вызов метода суперкласса из переопределенного метода
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.demo();
        
        System.out.println("---");
        Child child2 = new Child("Test");
        child2.show();
    }
}