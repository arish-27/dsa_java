import java.util.*;
public class nonrepeatingcharacter {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,1,2,4};
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }
    }
}
