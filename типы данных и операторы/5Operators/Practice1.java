public class Practice1 {
    public static void main(String[] args) {
        // Базовые типы
        int a = 10, b = 3;
        boolean p = true, q = false;
        
        // Все операторы по приоритету
        int c = 5; c += 3; c -= 2; c *= 2; c /= 3; c %= 3;
        String result = (a > b) ? "больше" : "меньше";
        boolean or = p || q;
        boolean and = p && q;
        int bitOr = 5 | 3;
        int bitXor = 5 ^ 3;
        int bitAnd = 5 & 3;
        boolean equal = a == b;
        boolean greater = a > b;
        int shift = 5 >> 1;
        int sum = a + b;
        int mult = a * b;
        int inc = ++a; int dec = --b;
        boolean not = !p;
        
        // Строки
        String s = "Hello" + " " + "World";
        s += "!";
    }
}