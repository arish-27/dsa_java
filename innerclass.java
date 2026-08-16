public class innerclass {
    public static void main(String[] args){
        a obj1=new a();
        obj1.show();
        a.b obj2=obj1.new b();
        obj2.free();

    }
}
class a{
    class b{
    void free(){
        System.out.println("arish");
    }
}
    void show(){
        System.out.println("java developer");
    }
}
