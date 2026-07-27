class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class advancalc extends calc{
    @Override
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
public class methodoverriding {
    public static void main(String[] args){
        advancalc obj=new advancalc();
        int r1=obj.add(2,3);
        System.out.println(r1);
    }
}
