public class Practice1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("default: " + obj.defaultField);
        System.out.println("protected: " + obj.protectedField);
        System.out.println("public: " + obj.publicField);
        obj.showAll();
    }
}

class MyClass {
    private String privateField = "private";
    String defaultField = "default";
    protected String protectedField = "protected"; 
    public String publicField = "public";
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    public void showAll() {
        System.out.println("Из того же класса: " + privateField);
        privateMethod();
    }
}