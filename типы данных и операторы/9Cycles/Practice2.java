public class Practice2 {
    public static void main(String[] args) {
        // break - выход из цикла
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // выходим при i=5
            }
            System.out.println(i);
        }
        
        // continue - пропуск итерации
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // пропускаем 3
            }
            System.out.println(i);
        }
    }
}