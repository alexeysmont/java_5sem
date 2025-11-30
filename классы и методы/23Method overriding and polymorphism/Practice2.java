class Parent {
    Number getNum() { return 1; }
}

class Child extends Parent {
    @Override
    Integer getNum() { return 2; } 
}

public class Practice2 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.getNum());
    }
}