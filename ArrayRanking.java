
import java.util.*;

public class ArrayRanking {
    public static void main(String[] args){
        int nums[]={2,9,6,1,0,4};
        int sorted[]=nums.clone();//[0,1,2,4,6,9]
        Arrays.sort(sorted);//[0,1,2,4,6,9]
        int rankarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<sorted.length;j++){
                if(nums[i]==sorted[j]){
                    rankarr[i]=j+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(rankarr));
    }
}
