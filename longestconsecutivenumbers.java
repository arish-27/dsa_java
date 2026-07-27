import java.util.*;
public class longestconsecutivenumbers {
    public static void main(String[] args){
        int arr[]={2,4,100,200,1,3};
        Arrays.sort(arr);
        int maxcount=1;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }else if (arr[i]!=arr[i-1]+1) {
                count=1;
            }
            maxcount=Math.max(count,maxcount);
        }
        System.out.println(maxcount);
    }
}
