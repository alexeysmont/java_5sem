import java.util.Date;

public class Practice3 {
    public static void main(String[] args) {
        Date now = new Date();
        
        System.out.printf("Часы: %tH%n", now);
        
        System.out.printf("Минуты: %tM%n", now);
        
        System.out.printf("Секунды: %tS%n", now);
        
        System.out.printf("День: %td%n", now);
        
        System.out.printf("Месяц: %tm%n", now);
    }
}