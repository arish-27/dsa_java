import java.util.*;
public class code2 {
    public static void main(String[] args){
        int arr[]={131,11,48};
        int digits[]=new int[10];
        for(int num:arr){
            while(num>0){
                int digit=num%10;
                digits[digit]=1;
                num/=10;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
