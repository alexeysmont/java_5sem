public class Practice3 {
    public static void main(String[] args) {
        // Текстовые блоки (Java 13+)
        String html = """
            <html>
                <body>
                    <h1>Hello World</h1>
                </body>
            </html>
            """;
        
        String query = """
            SELECT name, email
            FROM users
            WHERE age > 18
            """;
            
        System.out.println(html);
        System.out.println(query);
    }
}


Три кавычки """ - это чтобы писать текст в несколько строк без заморочек с + и \n.