import java.util.StringJoiner;

public class Practice2 {
    public static void main(String[] args) {
        //StringJoiner с разделителем
        StringJoiner sj = new StringJoiner(", ");
        sj.add("Java").add("Python").add("C++");
        System.out.println(sj); 
        
        // StringJoiner с префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(" | ", "[ ", " ]");
        sj2.add("Apple").add("Banana").add("Orange");
        System.out.println(sj2); // 
    }
}