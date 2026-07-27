import java.util.*;
public class largestinevenindexandsmallestinoddindex {
    public static void main(String[] args){
        int arr[]={1,4,3,2,6,5,7};
        methodd(arr);
    }
    public static void methodd(int arr[]){
        Arrays.sort(arr);
        int newarr[]=new int[arr.length];
        int i=0,j=arr.length-1;
        int count=0;
        while(i<=j){
            if(count%2==0){
                newarr[count]=arr[j];
                j--;
            }else{
                newarr[count]=arr[i];
                i++;
            }
            count++;
        }
        for(int num:newarr){
            System.out.print(num+" ");
        }
    }
}
