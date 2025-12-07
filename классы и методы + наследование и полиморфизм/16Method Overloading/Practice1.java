public class Practice1 {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        // цикл for (1)
        // в цикле тип переменной n на этапе компиляции - Number
        // компилятор выбирает метод на основе объявленного типа, а не фактического
        // поэтому для всех элементов массива будет вызван printNum(Number n)
        System.out.println("=== Результаты в цикле for (компиляционный тип: Number) ===");
        for (Number n : num) {
            a.printNum(n); // всегда вызывает printNum(Number n)
        }
        
        System.out.println("\n=== Результаты при прямом вызове (компилятор видит фактические типы) ===");
        
        // (2)
        // здесь компилятор видит точный тип каждого аргумента и выбирает наиболее специфичный метод
        
        // 1. new Integer(1) - явный объект Integer
        // выбор: printNum(Integer) - наиболее точное совпадение
        a.printNum(new Integer(1));
        
        // 2. 11 - литерал int, не требует упаковки
        // выбор: printNum(int) - точнее чем printNum(Integer) 
        a.printNum(11);
        
        // 3. 1.11f - литерал float
        // выбор: printNum(Float) - после упаковки в Float
        a.printNum(1.11f);
        
        // 4. 11.11 - литерал double
        // в классе A нет метода printNum(double), 
        // но есть printNum(Number) - double является подклассом Number
        // выбор: printNum(Number) - единственный подходящий метод
        a.printNum(11.11);
    }
}

class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }
    
    public void printNum(Number n) {
        System.out.println("Number = " + n);
    }
}