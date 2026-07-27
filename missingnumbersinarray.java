import java.util.*;
public class missingnumbersinarray {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,5,8};
        System.out.println(missing(arr));
        Arrays.sort(arr);
        for(int nums:arr){
        System.out.print(nums + " ");
        }
        int min=arr[0];
        int max=(arr[arr.length-1]);
        System.out.println();
        System.out.println("minimum element: "+min);
        System.out.println("maximum element: "+max);
        for(int i=min;i<=max;i++){
          int found=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=1;
                break;
                }
            }
          if(found==0){
            System.out.print(i+" ");
          }

        }
    }
    public static int missing(int arr[]){
      int n=arr.length;
      int expectedsum=n*(n+1)/2;
      int arrsum=0;
      for(int num:arr){
        arrsum+=num;
      }
      return expectedsum-arrsum;
    }
}
