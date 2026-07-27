import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int count=1;
        for(int i=1;i<size;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(nums[i]);

        }
        System.out.println("your count is: "+count);
    }
}
