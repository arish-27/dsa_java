
import java.util.*;

public class deloittecountfrequenciesofarrayelements {
    public static void main(String[] args) {
        
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]={10,20,10,5,20};
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        ArrayList <Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int result:list){
            System.out.println(result+","+map.get(result));
        }
        
    }
}
