public class Practice2 {
    public static void main(String[] args) {
        // да такая конструкция может быть
        try {
            System.out.println("Выполняем код в try");
            int result = 10 / 0; // вызовет исключение
        } finally {
            System.out.println("Finally выполнен!");
        }
        
        System.out.println("Программа продолжается");
    }
}