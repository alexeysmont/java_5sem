public class Practice2 {
    public enum Operation {
        PLUS("+") { 
            public double apply(double x, double y) { return x + y; } 
        },
        MINUS("-") { 
            public double apply(double x, double y) { return x - y; } 
        },
        TIMES("*") { 
            public double apply(double x, double y) { return x * y; } 
        },
        DIVIDE("/") { 
            public double apply(double x, double y) { return x / y; } 
        };
        
        private final String symbol;
        
        Operation(String symbol) {
            this.symbol = symbol;
        }
        
        public String getSymbol() { return symbol; }
        

        public abstract double apply(double x, double y);
    }

    public static void main(String[] args) {
        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.printf("%.1f %s %.1f = %.1f%n", 
                a, op.getSymbol(), b, op.apply(a, b));
        }
    }
}