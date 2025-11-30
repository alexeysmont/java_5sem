import java.io.*;

public class Practice4 {
    public static void main(String[] args) {
        // AutoCloseable позволяет использовать try-with-resources
        // ресурсы автоматически закрываются после выполнения блока
        
        try (FileInputStream input = new FileInputStream("file.txt");
             FileOutputStream output = new FileOutputStream("copy.txt")) {
            
            
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}
