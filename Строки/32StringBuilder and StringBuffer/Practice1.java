public class Practice1 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");

        // 1 append() - добавление в конец
        sb.append(" World");
        System.out.println("append: " + sb);

        // 2 insert() - вставка по индексу
        sb.insert(5, ",");
        System.out.println("insert: " + sb);

        // 3 delete() - удаление части
        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        // 4 reverse() - переворот строки
        System.out.println("reverse: " + sb.reverse());
        sb.reverse(); // возвращаем обратно

        // 5 replace() - замена части
        sb.replace(6, 11, "Java");
        System.out.println("replace: " + sb);

        // 6 capacity() - текущая вместимость
        System.out.println("capacity: " + sb.capacity());

        // 7 length() - длина
        System.out.println("length: " + sb.length());

        // 8 charAt() - символ по индексу
        System.out.println("charAt: " + sb.charAt(0));

        // 9 setCharAt() - замена символа
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb);

        // 10 substring() - подстрока
        System.out.println("substring: " + sb.substring(0, 5));

       
        StringBuffer sbf = new StringBuffer("Buffer");
        sbf.append(" example");
        System.out.println("StringBuffer: " + sbf);
    }
}