import java.io.*;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        // запись байтов в файл
        OutputStream output = new FileOutputStream("test.txt");
        
        String text = "Hello";
        for (char c : text.toCharArray()) {
            output.write(c); // запись по одному байту
        }
        output.close();
    }
}