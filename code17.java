import java.util.HashMap;

public class code17 {
    public static void main(String[] args){
        int arr[]={2,2,8,2};
        elementappearsonce(arr);
    }
    public static void elementappearsonce(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
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
