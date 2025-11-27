public class Practice1 {
    // Переменные-члены класса (имеют нулевые значения по умолчанию)
    byte b;        // 0
    short s;       // 0  
    int i;         // 0
    long l;        // 0L
    float f;       // 0.0f
    double d;      // 0.0
    char c;        // '\u0000'
    boolean bool;  // false

    public static void main(String[] args) {
        // Локальные переменные (должны быть инициализированы)
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        char c = '\u0000';
        boolean bool = false;
        
        System.out.println("Все переменные проинициализированы нулевыми значениями");
    }
}