public class Practice2 {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;
        
        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;  // выполняется
                // break отсутствует - проваливание в case 3
            case 3:
                i = 3;  // тоже выполняется
                break;
        }
        
        System.out.println("Результат: " + i); // Выведет 3
    }
}