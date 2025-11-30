// практика 1: интерфейс без модификатора - package-private (доступен только в пакете)
interface PackageInterface {
    void method();
}

// практика 2: public интерфейс - доступен везде
public interface PublicInterface {
    void method();
}

// практика 3: protected интерфейс - ошибка компилцяии
// protected interface ProtectedInterface {
//     void method();
// }

// практика 4: private интерфейс - ошибка компиляции 
// private interface PrivateInterface {
//     void method();
// }

class Test implements PackageInterface, PublicInterface {
    public void method() {
        System.out.println("Реализация метода");
    }
}

public class Practice {
    public static void main(String[] args) {
        Test test = new Test();
        test.method();
    }
}