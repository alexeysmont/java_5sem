public class Practice1 {
    public static void main(String[] args) {
        // нет это неправильная констуркция, 
        // try всегда должен сопровождаться хотя бы одним catch или finally
        
        /*
        try {
            System.out.println("Test");
        }
        */
        
        // правильно с catch или finally:
        try {
            System.out.println("Test");
        } catch (Exception e) {
            
        }
    }
}