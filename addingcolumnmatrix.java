import java.util.*;
public class addingcolumnmatrix {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int maxcolumn=0;
        for(int i=0;i<m;i++){
            int rowsum=0;
            for(int j=0;j<n;j++){
                rowsum+=matrix[j][i];
            }
            if(rowsum>maxcolumn){
                maxcolumn=rowsum;
            }
        }
        System.out.println("maxrow is: "+maxcolumn);
    }
}

    

