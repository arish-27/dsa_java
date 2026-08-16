public class code14 {
    public static void main(String[] args){
        int arr1[]={2,4,6,8,9,10,12};
        int arr2[]={2,4,6,8,10,12};
        extraelement(arr1,arr2);
    }
    public static void extraelement(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]!=arr2[j]){
                System.out.println(i);
                return;
            }else{
                i++;
                j++;
            }
        }
        System.out.println(i);
    }
}
