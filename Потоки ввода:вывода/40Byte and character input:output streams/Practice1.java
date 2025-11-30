import java.io.*;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        // чтение байтов из строки
        byte[] data = "Hello".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        
        int byteRead;
        while ((byteRead = input.read()) != -1) {
            System.out.print((char) byteRead); // чтение по одному байту
        }
        input.close();
    }
}