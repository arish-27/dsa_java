public class missingelement {
    public static void main(String[] args){
        int arr[]={1,1,2,4,4,3,3,6,6,5,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }
}
