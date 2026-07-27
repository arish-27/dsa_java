import java.util.*;
public class EvenOddMatrixDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num%2==0){
                    even=even+num;//even+=sum
                }else{
                    odd=odd+num;
                }
            }
        }
        System.out.println(even-odd);
    }
}