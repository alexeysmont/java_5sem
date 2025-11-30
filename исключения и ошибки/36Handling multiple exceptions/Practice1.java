public class Practice1 {
    public static void main(String[] args) {
        // одинаковая обработка разных исключений
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int zero = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // иерархия исключений
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1");
        }
    }
}

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}