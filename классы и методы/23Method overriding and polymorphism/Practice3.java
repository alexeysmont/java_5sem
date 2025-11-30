class Animal {
    void sound() { System.out.println("sound"); }
}

class Cat extends Animal {
    @Override
    void sound() { System.out.println("meow"); }
    
    // @Override
    // void soud() { } // ошибка: опечатка в имени
}

public class Practice3 {
    public static void main(String[] args) {
        new Cat().sound();
    }
}