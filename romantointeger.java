
import java.util.HashMap;

public class romantointeger {
    public static void main(String[] args){
        String s="III";
        HashMap <Character,Integer> map=new HashMap<>();
        int prev=0;
        int total=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('m',1000);
        for(int i=s.length()-1;i>=0;i--){
            int curr=map.get(s.charAt(i));
            if(curr<prev){
                total-=curr;
            }else{
                total+=curr;
            }
            prev=curr;
        }
        System.out.println(total);
    }
}
