public class deloitteperfectsquare {
    public static void main(String[] args) {
        deloitteperfectsquare obj=new deloitteperfectsquare();
        boolean ans=obj.perfecttsquare(14);
        System.out.println(ans);
    }
    public boolean perfecttsquare(int n){
        for(int i=2;i*i<=n;i++){
           if (i*i==n){
            return true;
           }
        }
        return false;
    }
}