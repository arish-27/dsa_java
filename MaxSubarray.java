import java.util.*;
public class MaxSubarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int currentsum=nums[0];
        int maximumsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maximumsum=Math.max(maximumsum,currentsum);
        }
        System.out.println(maximumsum);
    }
    
}
