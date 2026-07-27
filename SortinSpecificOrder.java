import java.util.*;
public class SortinSpecificOrder {
    public static void main(String[] args){
     List<Integer> even= new ArrayList<>();
    List<Integer> odd= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int N =sc.nextInt();
        int arr[] = new int[N];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           int num=arr[i];
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        odd.sort(Collections.reverseOrder());
        Collections.sort(even);
        List<Integer> result=new ArrayList<>(odd);
        result.addAll(even);
        System.out.println("your sorted array list is:");
        for(int num:result){
            System.out.print(num+" ");
        }
    } 
}
