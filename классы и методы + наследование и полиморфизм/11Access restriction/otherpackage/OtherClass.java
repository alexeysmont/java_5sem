package otherpackage;


public class OtherClass {
    public void test() {
        Practice1.MyClass obj = new Practice1.MyClass();
        // obj.privateField = "x"; // ошибка
        // obj.defaultField = "x"; //ошибка  
        // obj.protectedField = "x"; // ошибка
        obj.publicField = "ok"; // ок - public
        obj.showAll(); // ок - public метод
    }
}