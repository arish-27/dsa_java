import java.util.Arrays;
public class ArrayIntersectionTwoPointers {
    public static void main(String[] args) {
        int[] arr1 = {1,5,3};
        int[] arr2 = {2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        System.out.print("Intersection: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;  
            } else if (arr1[i] > arr2[j]) {
                j++; 
            } else {
                
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}