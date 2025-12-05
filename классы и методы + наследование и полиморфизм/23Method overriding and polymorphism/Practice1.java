public class Practice1 {
    void show(int a) { System.out.println("int: " + a); }
    void show(String s) { System.out.println("String: " + s); }
    
    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.show(1);
        p.show("text");
    }
}