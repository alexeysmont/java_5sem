public class Practice6 {
    public static void main(String[] args) {
        int i = 1000;
        byte b = (byte) i;    
        short s = (short) i;   
        char c = (char) i;     
        
        double d = 123.456;
        int i2 = (int) d;      
        System.out.println("int 1000 -> byte: " + b);
        System.out.println("int 1000 -> short: " + s);
        System.out.println("int 1000 -> char: " + c);
        System.out.println("double 123.456 -> int: " + i2);
    }
}