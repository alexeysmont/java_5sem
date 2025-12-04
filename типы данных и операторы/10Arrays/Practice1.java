public class Practice1 {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2; // a1 теперь ссылается на тот же массив, что и a2
        
        System.out.print("a1 после присваивания: ");
        for (int num : a1) {
            System.out.print(num + " "); //6 7 8 9 10
        }
        
        //изменение a2 повлияет на a1
        a2[0] = 100;
        System.out.println("\nПервый элемент a1: " + a1[0]); //100
    }
}