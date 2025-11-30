public class Practice1 {
    

    
    public static void printAll(String... strings) {
        System.out.print("Strings: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public static void printAll(int... numbers) {
        System.out.print("Integers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static void printAll(double... numbers) {
        System.out.print("Doubles: ");
        for (double n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    // Комбинация обычного параметра и varargs
    public static void printAll(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printAll("hello", "world");       
        printAll(1, 2, 3);              
        printAll(1.1, 2.2);              
        printAll("Numbers", 4, 5, 6);    
    }
}