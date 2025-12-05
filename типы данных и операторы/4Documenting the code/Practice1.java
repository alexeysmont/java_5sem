/**
 * этот класс демонстрирует использование javadoc комментариев
 * @author Student
 * @version 1.0
 */
public class Practice1 {
    
    /**
     * константа для примера
     */
    private static final int DEFAULT_VALUE = 10;
    
    /**
     * главный метод программы
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int result = calculate(5, 3);
        System.out.println("Результат: " + result);
    }
    
    /**
     * сумма двух чисел 
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     * @throws IllegalArgumentException если a или b отрицательные
     * @see #main(String[])
     * @since 1.0
     */
    public static int calculate(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Числа не могут быть отрицательными");
        }
        return a + b;
    }
}
