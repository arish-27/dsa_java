public class code29{
    public static void main(String[] args){
       int arr[] = {-2, -4};
       kadane(arr);
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            max=Math.max(sum,max);
        }
       }
       System.out.println(max);
    }
    public static void kadane(int arr[]){
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],arr[i]+currsum);
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
}