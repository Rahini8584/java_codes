public class Student {
    // int studentid = 101 ;
    // String studentname = "rahini";
    // int age = 20 ;
    double salary = 50000.0 ;
    double final_salary;

    public static void main(String arg[]) {
        // Student obj = new Student() ;
        // System.out.println("ID of Student : \n"+obj.studentid);
        // System.out.println("Name of Student : \n"+obj.studentname);
        // System.out.println("Age of Student : \n"+obj.age);

        // Student obj1 = new Student() ;
        // obj1.fxn();
        // obj1.fxn(12);
        Student emp1 = new Student();
        emp1.final_salary= 0.1*emp1.salary + emp1.salary ;
        System.out.println("Bonus :" +0.1*emp1.salary);
        System.out.println("Final salary : "+emp1.final_salary);
        
    } 
    void fxn(){
        System.out.println("hello from fxn()");
    }
    void fxn(int b){
        System.out.println("hello from fxn(int) = "+b);
    }
}
