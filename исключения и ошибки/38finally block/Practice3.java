public class Practice3 {
    public static void main(String[] args) {
        // нет такая конструкция не верна
        // у одного try может быть только один блок finally
        
        /*

        try {
            System.out.println("Test");
        } finally {
            System.out.println("First finally");
        } finally {
            System.out.println("Second finally");
        }
        */
        
        // правильно только один finally
        try {
            System.out.println("Test");
        } finally {
            System.out.println("Единственный finally блок");
        }
    }
}