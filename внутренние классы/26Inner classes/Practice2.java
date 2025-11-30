public class Practice2 {
    private String privateField = "private";
    protected String protectedField = "protected";
    public String publicField = "public";
    String packageField = "package";
    
    class Inner {
        void access() {
            System.out.println(privateField);    // доступно
            System.out.println(protectedField);  // доступно  
            System.out.println(publicField);     // доступно
            System.out.println(packageField);    // доступно
        }
    }
    
    public static void main(String[] args) {
        Practice2 outer = new Practice2();
        Inner inner = outer.new Inner();
        inner.access();
    }
}