public class Practice1 {
    byte b;        // 0
    short s;       // 0  
    int i;         // 0
    long l;        // 0L
    float f;       // 0.0f
    double d;      // 0.0
    char c;        // '\u0000'
    boolean bool;  // false

    public static void main(String[] args) {
        // локальные переменные 
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        char c = '\u0000';
        boolean bool = false;
        
        System.out.println("все переменные проинициализированы нулевыми значениями");
    }
}