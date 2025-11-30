public class Practice1 {
    public static void main(String[] args) {
        // исключение будет перехвачено
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
        
        // исключение не будет перехвачено 
        String str = null;
        System.out.println(str.length());
    }
}