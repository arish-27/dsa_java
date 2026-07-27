import java.util.*;
public class removedupliatesandsort {
    public static void main(String[] args) {
        int arr1[]={2,4,5,6};
        int arr2[]={2,3,5,7};
        secondary(arr1,arr2);
        TreeSet<Integer> set=new TreeSet<>();
        for(int nums1:arr1){
            set.add(nums1);
        }
        for(int nums2:arr2){
            set.add(nums2);
        }
        for(int num:set){
            System.out.print(num+" ");
        }
    }
    public static void secondary(int arr1[], int arr2[]){
        int i=0;
        int j=0;
        int count=0;
        int newarr[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newarr[count]=arr1[i];
                
                i++;
            }else if(arr2[j]<arr1[i]){
                newarr[count]=arr2[j];
                
                j++;
            }else{
                newarr[count]=arr1[i];
                i++;
                j++;
            }
            count++;
        }
        for(int nums:newarr){
            System.out.print(nums+" ");
        }
    }
}
