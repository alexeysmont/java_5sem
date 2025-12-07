interface Interface1 {
    default void sameMethod() {
        System.out.println("Method from Interface1");
    }
}

interface Interface2 {
    default void sameMethod() {
        System.out.println("Method from Interface2");
    }
}

class ConflictClass implements Interface1, Interface2 {
    @Override
    public void sameMethod() {
        Interface1.super.sameMethod();
        System.out.println("My own implementation");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        ConflictClass obj = new ConflictClass();
        obj.sameMethod();
    }
}