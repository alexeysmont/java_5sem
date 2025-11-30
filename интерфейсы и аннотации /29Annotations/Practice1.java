class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child method");
    }
    
    @Deprecated
    void oldMethod() {
        System.out.println("Deprecated method");
    }
    
    @SuppressWarnings("unchecked")
    void uncheckedWarning() {
        java.util.List list = new java.util.ArrayList();
        list.add("test");
    }
}


@interface BaseAction {
    int level();
    String name() default "default";
}

@BaseAction(level = 2)
class Base {
    public void test() {
        System.out.println("Testing custom annotation");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();       // @Override пример
        obj.oldMethod();;    // @Deprecated пример- будет предупреждение
        
        Base base = new Base();
        base.test();
        
   
        BaseAction action = Base.class.getAnnotation(BaseAction.class);
        System.out.println("Annotation level: " + action.level());
        System.out.println("Annotation name: " + action.name());
    }
}