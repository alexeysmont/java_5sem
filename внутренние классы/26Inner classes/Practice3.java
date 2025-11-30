public class Practice3 {
    void accessInner() {
        Inner inner = new Inner();
        System.out.println(inner.privateField);  // недоступен
        System.out.println(inner.protectedField); // доступен (в том же классе)
        System.out.println(inner.publicField);    // доступен
        System.out.println(inner.packageField);   // доступен
    }
    
    class Inner {
        private String privateField = "private";
        protected String protectedField = "protected";
        public String publicField = "public";
        String packageField = "package";
    }
    
    public static void main(String[] args) {
        new Practice3().accessInner();
    }
}