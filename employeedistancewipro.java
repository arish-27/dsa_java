import java.util.Scanner;
public class employeedistancewipro {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int distance[]=new int[N];
        for(int i=0;i<N;i++){
            distance[i]=sc.nextInt();
        }
        for(int i=0;i<distance.length;i++){
            if(distance[i]<=n && distance[i]>=m){
                System.out.println(i);
            }
        }
    }
}
