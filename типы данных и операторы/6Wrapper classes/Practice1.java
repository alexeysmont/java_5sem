public class Practice1 {
    public static void main(String[] args) {
        // decode понимает разные системы счисления
        System.out.println(Integer.decode("123"));    // десятичная
        System.out.println(Integer.decode("0x7B"));   // hex
        System.out.println(Integer.decode("0173"));   // octal
        System.out.println(Integer.decode("#7B"));    // hex с #
    }
}