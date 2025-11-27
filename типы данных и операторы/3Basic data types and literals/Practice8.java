public class Practice8 {
    public static void main(String[] args) {
        // Type inference с var (Java 10+)
        var name = "Anna";           // String
        var age = 25;                // int
        var height = 1.65;           // double
        var isStudent = true;        // boolean
        var list = new java.util.ArrayList<String>(); // ArrayList<String>
        
        System.out.println("name: " + name + " (" + name.getClass() + ")");
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("isStudent: " + isStudent);
        System.out.println("list: " + list.getClass());
        
        // var нельзя использовать без инициализации
        // var x; // ОШИБКА!
    }
}