public class Practice1 {
    public static void main(String[] args) {
        // byte
        byte b = 1;
        switch(b) {
            case 1: System.out.println("byte"); break;
        }
        
        // short  
        short s = 1;
        switch(s) {
            case 1: System.out.println("short"); break;
        }
        
        // int
        int i = 1;
        switch(i) {
            case 1: System.out.println("int"); break;
        }
        
        // char
        char c = 'A';
        switch(c) {
            case 'A': System.out.println("char"); break;
        }
        
        // String
        String str = "test";
        switch(str) {
            case "test": System.out.println("String"); break;
        }
        
        // enum
        Color color = Color.RED;
        switch(color) {
            case RED: System.out.println("enum"); break;
        }
        
        // Byte (autounboxing)
        Byte byteObj = 1;
        switch(byteObj) {
            case 1: System.out.println("Byte"); break;
        }
        
        // Character (autounboxing)
        Character charObj = 'A';
        switch(charObj) {
            case 'A': System.out.println("Character"); break;
        }
    }
    
    enum Color { RED, GREEN, BLUE }
}