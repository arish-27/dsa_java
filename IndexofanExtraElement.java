public class IndexofanExtraElement {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,9,10,12};
        int b[] = {2,4,6,8,10,12};
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                i++;
                j++;
            }else{
                System.out.println(i);
                return;
            }
        }
        System.out.println(i);
    }
}
