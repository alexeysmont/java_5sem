package otherpackage;


public class OtherClass {
    public void test() {
        Practice1.MyClass obj = new Practice1.MyClass();
        // obj.privateField = "x"; // Ошибка
        // obj.defaultField = "x"; // Ошибка  
        // obj.protectedField = "x"; // Ошибка
        obj.publicField = "ok"; // OK - public
        obj.showAll(); // OK - public метод
    }
}