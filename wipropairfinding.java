import java.util.*;
public class wipropairfinding {
    public static void main(String[] args){
        int arr[]={10,20,20,10,10,30,50,10,20};
        hash(arr);
        Arrays.sort(arr);
        int pair=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                pair++;
                i++;
            }
        }
        System.out.println(pair);
    }
    public static void hash(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int pair=0;
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int value:map.values()){
            pair+=value/2;
        }
        System.out.println(pair);
    }
}
