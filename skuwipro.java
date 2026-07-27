import java.util.*;
public class skuwipro {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int price[]=new int[n];
        int distance[]=new int[n];
        int sku[]=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            distance[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sku[i]=sc.nextInt();
        }
        for(int i=0;i<sku.length;i++){
            if(sku[i]>0){
                int finalprice=distance[i]*price[i];
                System.out.println(finalprice+" ");
            }
        }
    }
}
