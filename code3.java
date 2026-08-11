import java.util.ArrayList;
import java.util.Collections;

public class code3 {
    public static void main(String[] args){
         int arr[]={1, 2, 3, 5, 4, 7, 10};
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int num:arr){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int index=0;
        for(int num:odd){
            arr[index++]=num;
        }
        for(int num:even){
            arr[index++]=num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
