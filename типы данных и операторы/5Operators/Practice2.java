public class Practice2 {
    static class Animal {}
    static class Dog extends Animal {}
    
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal nullAnimal = null;
        
        // instanceof примеры
        System.out.println(animal instanceof Animal);  // true
        System.out.println(animal instanceof Dog);     // true
        System.out.println(nullAnimal instanceof Animal); // false
    }
}