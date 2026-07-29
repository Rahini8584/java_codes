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
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = 0;
        int[] prime = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ; i<n ;i++){
            for(int j = 2; j<=Math.sqrt(arr[i]);j++){
                if(arr[i]%j==0){
                    break;
                }
                else{
                    prime[p++]=arr[i];
                }
            }
        }
        for(int i = 0 ; i<p;i++){
            System.out.print(prime[i]+" ");
        }
        sc.close();

    }
}
