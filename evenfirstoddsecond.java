import java.util.*;
public class evenfirstoddsecond {
    public static void main(String[] args) {
        int arr[]={10,98,3,33,12,22,21,11};
        normal(arr);
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        for(int num:even){
            System.out.print(num+" ");
        }
        for(int num:odd){
            System.out.print(num+" ");
        }
    }
    public static void normal(int arr[]){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        for(int num:arr){
        System.out.println(num);
        }
    }
}
