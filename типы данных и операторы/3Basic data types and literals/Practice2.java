public class Practice2 {
    public static void main(String[] args) {
        // Имя "Анна" в Unicode
        System.out.println("\u0410\u043D\u043D\u0430");
        
        // Альтернативный вариант
        char a = '\u0410'; // А
        char n = '\u043D'; // н
        System.out.println("" + a + n + n + a);
    }
}
