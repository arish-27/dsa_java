import java.util.*;
public class singlenumber {
    public static void main(String[] args){
        int arr[]={2,1,1,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }
    }
}
