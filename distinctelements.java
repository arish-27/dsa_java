import java.util.HashSet;

public class distinctelements {
    public static void main(String[] args){
    int[] arr={1,2,2,3,4,4,5};
    men(arr);
    int n=arr.length;
    for(int i=0;i<n;i++){
        int j;
        for(j=0;j<i;j++){
            if(arr[i]==arr[j]){
                
                break;
            }
         
        }
        
           if(i==j){
        System.out.println(arr[i]+" ");
        }
         
        }
   
    }
    public static void men(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int a:set){
        System.out.println(a);
    }
    }
    
}
