import java.io.*;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Первая строка\n");
        writer.flush(); // принудительно записываем данные в файл
        writer.write("Вторая строка\n");
        writer.close();
        
        // flush() заставляет немедленно записать данные а не ждать пока буфер заполнится
    }
}