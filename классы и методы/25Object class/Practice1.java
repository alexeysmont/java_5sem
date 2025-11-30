class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 1 рефлексивность
        if (obj == null || getClass() != obj.getClass()) return false; // 2 проверка типа
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // 3 сравнение полей
    }
    
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age; // согласованность с equals()
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Ivan", 25);
        Person p3 = new Person("Maria", 30);
        
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
    }
}