class Parent {
    String name = "Parent";
    
    void show() {
        System.out.println("Parent method");
    }
    
    Parent() {
        System.out.println("Parent constructor");
    }
    
    Parent(String name) {
        this.name = name;
        System.out.println("Parent param constructor: " + name);
    }
}

class Child extends Parent {
    String name = "Child";
    
    Child() {
        // super() вызывается автоматически
        System.out.println("Child constructor");
    }
    
    Child(String name) {
        super(name); // вызов конструктора родителя
        System.out.println("Child param constructor");
    }
    
    void show() {
        System.out.println("Child method");
    }
    
    void demo() {
        System.out.println("this.name: " + this.name); // текущий класс
        System.out.println("super.name: " + super.name); // родительский класс
        
        this.show(); // метод текущего класса
        super.show(); // метод родительского класса
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.demo();
        
        System.out.println("---");
        new Child("Test");
    }
}