public class code00{
    public static void main(String[] args) {
        int arr[]={4,6,2,2,2,2,2,4,6,7,5,3,2,4,4};
        jumpletters(arr);
    }
    public static void jumpletters(int arr[]){
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]+" ");
            i=arr[i]+i;
        }
    }
}