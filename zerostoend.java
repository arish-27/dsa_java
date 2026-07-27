public class zerostoend {
    public static void main(String[] args){
        int arr[]={1,2,0,4,3,0,5,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
        }
    }   
}
