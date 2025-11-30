public class Practice2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (final Exception e) {
            // final означает, что ссылку e нельзя изменить
            // e = new Exception(); ошибка, нельзя переприсвоить
            System.out.println(e.getMessage());
        }
        
    
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Внутренний catch: " + e.getMessage());
                throw e; // перебрасываем исключение наружу
            }
        } catch (Exception e) {
            System.out.println("Внешний catch: " + e.getMessage());
        }
    }
}