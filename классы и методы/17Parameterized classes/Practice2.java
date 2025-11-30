import java.util.*;

public class Practice2 {
    // <? extends T> - чтение (producer)
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) { // Можно читать как Number
            sum += n.doubleValue();
        }
        return sum;
    }
    
    // <? super T> - запись (consumer)
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i); // Можно добавлять Integer
        }
    }
    
    public static void main(String[] args) {
        // <? extends Number> - принимает Number и его подклассы
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println(sum(ints)); // 6.0
        System.out.println(sum(doubles)); // 6.6
        
        // <? super Integer> - принимает Integer и его суперклассы
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers); // [1, 2, 3]
        
        List<Object> objects = new ArrayList<>();
        addNumbers(objects);
        System.out.println(objects); // [1, 2, 3]
    }
}