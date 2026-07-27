import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
            // Main diagonal
for (int i = 0; i < n; i++) {
    list.add(matrix[i][i]);
}

// Secondary diagonal
for (int i = 0; i < n; i++) {
    list.add(matrix[i][n - 1 - i]);
}
         if (n % 2 == 1) {
            int center = matrix[n / 2][n / 2];
            list.remove(Integer.valueOf(center));
        }
        int sum=0;
        for(int val:list){
            sum=sum+val;
        }
        System.out.println(sum);
    }
}
