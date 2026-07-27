class Student{
    String name;
    int age;
    void Study(){
        System.out.println(name+" is studying");
        System.out.println("He is a age of "+age );
    }
}
public class ClassMethodsObject {
    public static void main(String[] args) {
        Student s= new Student();
        s.name="Arish";
        s.age=20;
        s.Study();
    }
    
}
