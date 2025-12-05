import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        
        // instanceof с параметризованными классами
        System.out.println(stringList instanceof List); // true
        System.out.println(intList instanceof List); // true
        System.out.println(stringList instanceof ArrayList); // true
        
        //  cтирание типов - нельзя проверить параметризацию
        // System.out.println(stringList instanceof List<String>); //   ошибка компиляции
    }
}