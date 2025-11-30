public class Practice1 {
    public static void main(String[] args) {
        new A(100);
    }
}

class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}

/*
Вывод:
static logic
logic (1) id= 0
logic (2) id= 1
ctor id= 100

static logic - статический блок выполняется первым, при загрузке класса
logic (1) id= 0 - первый логический блок, поле id еще не инициализировано 
logic (2) id= 1 - второй логический блок, поле id уже инициализировано значением 1
ctor id= 00 - конструктор, меняет значение id на 100

*/