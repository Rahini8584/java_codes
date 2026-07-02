public class Student {
    int studentid = 101 ;
    String studentname = "rahini";
    int age = 20 ;


    public static void main(String arg[]) {
        Student obj = new Student() ;
        System.out.println("ID of Student : \n"+obj.studentid);
        System.out.println("Name of Student : \n"+obj.studentname);
        System.out.println("Age of Student : \n"+obj.age);

        Student obj1 = new Student() ;
        obj1.fxn();
        obj1.fxn(12);

    }
    void fxn(){
        System.out.println("hello from fxn()");
    }
    void fxn(int b){
        System.out.println("hello from fxn(int) = "+b);
    }
}
