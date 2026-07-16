import java.util.Scanner;
public class Student {
    // int studentid = 101 ;
    // String studentname = "rahini";
    // int age = 20 ;
    // double salary = 50000.0 ;
    // double final_salary;

   
    public static void main(String arg[]) {


        // int age ; 
        // String Name ;


        // Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER YOUR AGE : ");
        // age=sc.nextInt();


        // System.out.println("ENTER YOUR NAME : ");
        // Name=sc.nextLine();
         

        // System.out.println("Name is "+Name);
        // System.out.println("Age is "+age);

        // sc.close();


        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i<5 ; i++){
        arr[i]=sc.nextInt();
        }
       for(int i = 0 ; i<5 ; i++){
        System.out.print(arr[i]+ " ");
       }
       sc.close();




        // int num1 = 20 ; 
        // int num2 = 10 ;
        // int num3 = 30 ;
        // int n = 130 ;
        //  Student obj = new Student() ;  
        //  obj.percentage();

        // obj.simpleInterest(1000, 1,  2);

        // obj.totalBill(100);

        // obj.square(2);

        // obj.cube(3);

        // obj.hoursMinutes(n);

        // obj.avg(num1,num2,num3);

        // // System.out.println("ID of Student : \n"+obj.studentid);
        // // System.out.println("Name of Student : \n"+obj.studentname);
        // // System.out.println("Age of Student : \n"+obj.age);
        // obj.sum(num1 ,num2);
        // obj.diff(num1 ,num2);
        // obj.prod(num1 ,num2);
        // obj.quot(num1 ,num2);

        // Student obj1 = new Student() ;
        // obj1.swapNumbers(1,2);
        // obj1.fxn();
        // obj1.fxn(12);
        // Student emp1 = new Student();
        // emp1.final_salary= 0.1*emp1.salary + emp1.salary ;
        // System.out.println("Bonus :" +0.1*emp1.salary);
        // System.out.println("Final salary : "+emp1.final_salary);
        
    } 

     
    // void percentage(){
    //     int a = 90 , b= 99 , c= 89 , d= 88 , e = 98;
    //     double percent =  (a+b+c+d+e)/5;
    //     System.out.println(percent);
    // }



    // void simpleInterest(int p , int r , int t){
    //     int  total = p + (p*r*t);
    //     System.out.println(total);
    // }



    // void totalBill(int n){
    //     double bill = (0.18 * n)+ n;
    //     System.out.println(bill);
    // }


    // void square(int n){
    //     System.out.println(n*n);
    // }



    // void cube(int n){
    //     System.out.println(n*n*n);
    // }


    // void hoursMinutes(int n){
    //     int h = n/60;
    //     int m = n-(h*60);
    //     System.out.println("total hours =" +h);
    //     System.out.println("total minutes =" + m);


    //   }
    // void avg(int a , int b , int c){
    //     float avg = (a+b+c)/3;
    //     System.out.println(avg);
    //     }


    // void swapNumbers(int a ,  int b){
    //     int c ;
    //     c= a ;
    //     a=b;
    //     b= c;
    //     System.out.println(a);
    //     System.out.println(b);
    // }


    // void sum(int a , int b){
    //     int sum  = a+b ;
    //     System.out.println(sum);
    // }


    // void diff(int a , int b){
    //     int diff = a-b ;
    //     System.out.println(diff);
    // }


    // void prod(int a , int b){
    //     int prod = a*b;
    //     System.out.println(prod);
    //     }



    // void quot(int a , int b ){
    //     int quot = a/b;
    //     System.out.println(quot);
    // }


    // void fxn(){
    //     System.out.println("hello from fxn()");
    // }


    // void fxn(int b){
    //     System.out.println("hello from fxn(int) = "+b);
    // }
}

