public class Practice3 {
    public static void main(String[] args) {
        // тройные кавычки для многострочных строк
        String text = """
            Первая строка
            Вторая строка
            Третья строка""";
            
        System.out.println(text);
        
        // сохраняют форматирование и переносы строк
        String json = """
            {
                "name": "John",
                "age": 30
            }""";
            
        System.out.println(json);
    }
}