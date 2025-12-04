public class Practice7 {
    public static void main(String[] args) {
        int a = 120;
        
        // byte b = a + 10; // ошибка, нужно явное приведение
        byte c = (byte)(a + 10); 
        // byte d = a + 1;   // ошибка, нужно явное приведение
        
        System.out.println("c = " + c); // 130 (но в byte это -126 из-за переполнения)
        
    
        // a + 10 = 130, что больше максимального значения byte (127)
        // при приведении к byte происходит переполнение: 130 - 256 = -126
    }
}