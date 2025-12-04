public class Practice2 {
    public static void main(String[] args) {
        // имя "Саша" в Unicode
        System.out.println("\u0421\u0430\u0448\u0430");
        
        // альтернативный вариант
        char c = '\u0421'; // С
        char a = '\u0430'; // а
        char sh = '\u0448'; // ш
        System.out.println("" + c + a + sh + a);
    }
}