public class Practice2 {
    public static void main(String[] args) {
        // Пример с break - выход из цикла при условии
        System.out.println("Пример break:");
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break; // выходим из цикла когда i=5
            }
            System.out.println("i = " + i);
        }
        
        // Пример с continue - пропуск итерации
        System.out.println("\nПример continue:");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue; // пропускаем итерацию когда i=3
            }
            System.out.println("i = " + i);
        }
        
        // Комбинированный пример
        System.out.println("\nКомбинированный пример:");
        int count = 0;
        while(count < 10) {
            count++;
            if(count % 2 == 0) {
                continue; // пропускаем четные числа
            }
            if(count == 7) {
                break; // выходим при достижении 7
            }
            System.out.println("Нечетное: " + count);
        }
    }
}