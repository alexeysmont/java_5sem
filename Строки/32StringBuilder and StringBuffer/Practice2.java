public class Practice2 {
    public static void main(String[] args) {
        String str = "Hello";
        
        // String -> StringBuilder
        StringBuilder sb = new StringBuilder(str);
        
        // String -> StringBuffer  
        StringBuffer sbf = new StringBuffer(str);
        
        // StringBuilder -> String
        String fromSb = sb.toString();
        
        // StringBuffer -> String
        String fromSbf = sbf.toString();
        
        // StringBuilder -> StringBuffer (через String)
        StringBuffer sbToSbf = new StringBuffer(sb.toString());
        
        // StringBuffer -> StringBuilder (через String)
        StringBuilder sbfToSb = new StringBuilder(sbf.toString());
        
        System.out.println("Original: " + str);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
        System.out.println("From StringBuilder: " + fromSb);
        System.out.println("From StringBuffer: " + fromSbf);
    }
}