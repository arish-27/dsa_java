import java.util.*;
public class evenindescendingandoddinascendingorder{
    public static void main(String[] args) {
        int nums[]={5,2,4,9,7,6};
        sortedd(nums);
    }
    public static void sortedd(int nums[]){
    ArrayList<Integer> even=new ArrayList<>();
    ArrayList<Integer> odd=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            even.add(nums[i]);
        }else{
            odd.add(nums[i]);
        }
    }
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd);
        for(int num:even){
            System.out.print(num+" ");
        }
        for(int num:odd){
            System.out.print(num+" ");
        }
    }
}