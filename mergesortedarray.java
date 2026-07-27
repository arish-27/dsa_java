import java.util.*;
public class mergesortedarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of nums1");
        int size1=sc.nextInt();
        int[] nums1=new int[size1];
        System.out.println("Enter the array elements of nums1");
        for(int i=0;i<size1;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("enter the value of m: ");
        int m=sc.nextInt();
        System.out.println("enter the size of nums2");
        int size2=sc.nextInt();
        int[] nums2=new int[size2];
        System.out.println("Enter the array elements of nums2");
        for(int i=0;i<size2;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        System.out.println("the sorted array is:");
        for(int x=0;x<nums1.length;x++){
            System.out.println(nums1[x]);
        }
    }
    
}
