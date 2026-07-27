import java.util.*;
class plusonee{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key value:");
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
                System.out.println("key founded at: " +i);
                break;
            }
        
        }
        if(flag==0){
                System.out.println("key not founded");
    }
}
}
