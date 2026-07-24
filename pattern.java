// import java.util.Scanner ;
// public class pattern{

//     public static void main(String arg[] ){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<= n ; i++){
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }




// import java .util.Scanner;
// public class pattern{
//     public static void main(String arg[]){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<=n ; i++){
//             for(int j =n-1 ; j>=i; j--){
//                 System.out.print("*");
//             }
//             for(int k =0 ; k<i ; k++){
                
//                 System.out.print(k+1);
                
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }





// import java .util.Scanner;
// public class pattern{
//     public static void main(String arg[]){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<=n ; i++){
//             for(int j= i ; j>0; j--){
//                 System.out.print(j);
               
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }



// import java .util.Scanner;
// public class pattern{
//     public static void main(String arg[]){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<=n ; i++){
//             for(int j=1 ; j<=i; j++){
//                 System.out.print(j);
               
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }




// import java .util.Scanner;
// public class pattern{
//     public static void main(String arg[]){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<=n ; i++){
//             for(int j =n-1 ; j>=i ; j--){
//                 System.out.print("*");
//             }
            
//             for(int k = 1 ; k<=i; k++){
                
//                 System.out.print(i);
                
//             }
            
//             System.out.println();

//         }
//         sc.close();
//     }
// }


// import java .util.Scanner;
// public class pattern{
//     public static void main(String arg[]){
//         int n ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         n=sc.nextInt();
//         for(int i = 1 ; i<=n ; i++){
//             for(int j =n-1 ; j>=i ; j--){
//                 System.out.print("*"+ "   ");
//             }
            
//             for(int k = 1 ; k<=i; k++){
                
//                 System.out.print(k*2+ " ");
                
//             }
            
//             System.out.println();

//         }
//         sc.close();
//     }
// }


import java.util.Scanner;
public class pattern{
    public  static void main(String arg[]){
        int n ; 
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a= 0 ; int b= 1;
        for(int i = 0 ; i<n ; i++){
            
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        

        }
        sc.close();
    }
}