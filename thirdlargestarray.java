public class thirdlargestarray {
    public static void main(String[] args) {
        int arr[]={10, 5, 7, 88, 19, 17, 26,20, 6};
        int first=0;
        int second=0;
        int third=0;                      //in case array consisting of negative elements means we does not intitialize the value with zero
        for(int i=0;i<arr.length;i++){    //we want to initialize with, first=Integer.MIN_VALUE;
            if(arr[i]>first){                                         //second=Integer.MIN_VALUE;
                third=second;                                         //third=Integer.MIN_VALUE;
                second=first;
                first=arr[i];
            }else if (arr[i]>second) {
                third=second;
                second=arr[i];
            }else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println(third);
    }
}
