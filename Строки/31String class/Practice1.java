public class Practice1 {
    public static void main(String[] args) {
        String str = " Hello World ";
        
        // length() - длина строки
        System.out.println("length: " + str.length());
        
        // trim() - удаление пробелов по краям
        System.out.println("trim: '" + str.trim() + "'");
        
        // toUpperCase() - в верхний регистр
        System.out.println("toUpperCase: " + str.toUpperCase());
        
        // substring() - часть строки
        System.out.println("substring: " + str.substring(1, 5));
        
        // eplace() - замена символов
        System.out.println("replace: " + str.replace('l', 'L'));
        
        // split() - разделение на массив
        String[] parts = str.trim().split(" ");
        System.out.println("split: " + parts.length);
        
        // equals() - сравнение строк
        System.out.println("equals: " + str.equals(" Hello World "));
        
        // contains() - проверка содержания подстроки
        System.out.println("contains: " + str.contains("World"));
        
        // сharAt() - символ по индексу
        System.out.println("charAt: " + str.charAt(1));
        
        // indexOf() - индекс первого вхождения
        System.out.println("indexOf: " + str.indexOf('W'));
    }
}