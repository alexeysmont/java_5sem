import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        
        // toString
        System.out.println("toString: " + Arrays.toString(arr));
        
        // sort + binarySearch
        Arrays.sort(arr);
        System.out.println("После sort: " + Arrays.toString(arr));
        System.out.println("binarySearch 3: " + Arrays.binarySearch(arr, 3));
        
        // equals
        int[] arr2 = {1, 2, 3, 5, 8};
        System.out.println("equals: " + Arrays.equals(arr, arr2));
        
        // compare
        int[] arr3 = {1, 2, 3};
        System.out.println("compare: " + Arrays.compare(arr, arr3));
    }
}