public class binarySearch {
    public static void main(String[] args){
        int arr[]={1,3,5,7,9};
        int target=3;
        int right=arr.length-1;
        int left=0;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                
                System.out.println("element found");
                return;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        System.out.println("element not found");
    }   
}
