
import java.util.Scanner;

public class removeelememnt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key value");
        int val=sc.nextInt();
        System.err.println("enter the array elements");
        int size=sc.nextInt();
        int nums[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
            
        }
        System.out.println(count);
        for(int i=0;i<count;i++){
            System.out.print(nums[i]);
        }


    }
}
