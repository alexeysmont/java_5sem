public class Practice5 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 100;
        long l = 1000L;
        float f = 2.5f;
        double d = 3.14;
        
        // Автоматическое расширение типов
        double result1 = b + f;     // byte -> float -> double
        long result2 = i + l;       // int -> long
        double result3 = l + d;     // long -> double
        float result4 = i + f;      // int -> float
        
        System.out.println("byte + float = double: " + result1);
        System.out.println("int + long = long: " + result2);
        System.out.println("long + double = double: " + result3);
        System.out.println("int + float = float: " + result4);
    }
}