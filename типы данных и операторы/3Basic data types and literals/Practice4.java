public class Practice4 {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        
        // Конкатенация строк с разными типами
        String result = "Имя: " + name + 
                       ", Возраст: " + age + 
                       ", Рост: " + height + 
                       ", Студент: " + isStudent;
        
        System.out.println(result);
    }
}