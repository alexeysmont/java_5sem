public class Practice1 {
    public static void main(String[] args) {
        // Бесконечный цикл while
        while(true) {
            System.out.println("Бесконечный while");
            break; // убираем break для настоящего бесконечного цикла
        }
        
        // Бесконечный цикл do-while
        do {
            System.out.println("Бесконечный do-while");
            break; // убираем break для настоящего бесконечного цикла
        } while(true);
        
        // Еще вариант бесконечного while
        int value = 1;
        while(value > 0) {
            System.out.println("Кажется бесконечный");
            value++; // убрать break и value++ для бесконечности
            break;
        }
    }
}

Примечание: В Practice1.java я добавил break в бесконечные циклы, чтобы код можно было запустить. Для демонстрации настоящих бесконечных циклов нужно убрать эти break.