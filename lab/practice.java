package lab;
import java.util.Scanner;

public class practice {
    // public static void main(String[] args){


    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     int e= 0 , o=0;
    //     int[] even = new int[n];
    //     int[] odd = new int[n];


    //     for(int i = 0 ; i< n ;i++){
    //         arr[i]=sc.nextInt();
    //         if(arr[i]%2==0){
    //             even[e++]=arr[i];
    //         }
    //         else{
    //             odd[o++]=arr[i];
    //         }
    //     }


    //     for(int i = 0 ; i<e ; i++){
    //         System.out.print(even[i] + " ");
    //     }
        
    //     System.out.println();

    //     for(int i = 0 ; i<o ; i++){
    //         System.out.print(odd[i] + " ");
    //     }
         
    //     sc.close();
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
      
        String reversestr = "";
        for(int i = 0 ; i<=str.length()-1;i++){
            reversestr = reversestr + str.charAt(str.length()-1-i);
        }
        if(str.equalsIgnoreCase(reversestr)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is a not palindrome");
        }
        
       
        sc.close();

    }
}
