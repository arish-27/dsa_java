public class jumpgameI {
    public static void main(String[] args){
        int arr[]={2,3,1,1,4};
        int maxreach=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxreach){
                System.out.println(false);
            }
            if(i+arr[i]>maxreach){
                maxreach=i+arr[i];
            }
        }
        System.out.println(true);
    }
}
