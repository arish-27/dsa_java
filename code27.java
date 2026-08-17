public class code27 {
    public static void main(String[] args){
        int arr[]={2, 2, 0, 4, 0, 8};
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                arr[i-1]=arr[i-1]*2;
                arr[i]=0;
            }
        }
        int count=0;
        for(int num:arr){
            if(num!=0){
                arr[count]=num;
                count++;
            }
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
        for(int num:arr){
        System.out.println(num);
        }
    }
}
