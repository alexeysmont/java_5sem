interface MyInterface {
    class NestedClass {
        static void show() {
            System.out.println("Nested in interface");
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MyInterface.NestedClass.show(); // прямой вызов
    }
}