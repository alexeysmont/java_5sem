// Practice1.java
class Parent {
    private String privateField = "private доступен только в этом классе";
    String defaultField = "default доступен в том же пакете"; // без спецификатора
    protected String protectedField = "protected доступен в пакете и подклассах";
    public String publicField = "public доступен всем";
    
    private void privateMethod() {
        System.out.println("приватный метод: " + privateField);
    }
    
    void defaultMethod() {
        System.out.println("метод по умолчанию: " + defaultField);
        privateMethod(); // можно вызвать private метод внутри класса
    }
    
    protected void protectedMethod() {
        System.out.println("защищенный метод: " + protectedField);
    }
    
    public void publicMethod() {
        System.out.println("публичный метод: " + publicField);
        System.out.println("из публичного метода можно обратиться к:");
        System.out.println("- " + privateField);
        System.out.println("- " + defaultField);
        System.out.println("- " + protectedField);
    }
}

class Child extends Parent {
    void testAccess() {
        // System.out.println(privateField); // ошибка private недоступен
        System.out.println(defaultField); // все хорошо, в том же файле
        System.out.println(protectedField); // protected доступен подклассу
        System.out.println(publicField); // public доступен всем
        
        // privateMethod(); // ошибка private недоступен
        defaultMethod(); 
        protectedMethod(); 
        publicMethod(); 
    }
}

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация спецификаторов доступа ===");
        
        Parent parent = new Parent();
        
        // System.out.println(parent.privateField); // ошибка private недоступен
        System.out.println(parent.defaultField); 
        System.out.println(parent.protectedField); 
        System.out.println(parent.publicField); 
        
        System.out.println("\n=== Вызов методов ===");
        // parent.privateMethod(); // ошибка private недоступен
        parent.defaultMethod(); 
        parent.protectedMethod(); 
        parent.publicMethod(); 
        
        System.out.println("\n=== Тест в дочернем классе ===");
        Child child = new Child();
        child.testAccess();
    }
}