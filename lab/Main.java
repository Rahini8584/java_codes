// perplexity code  

package lab;
import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int evenCount = 0, oddCount = 0;

//         for (int num : arr) {
//             if (num % 2 == 0) evenCount++;
//             else oddCount++;
//         }

//         int[] even = new int[evenCount];
//         int[] odd = new int[oddCount];

//         int e = 0, o = 0;
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 even[e++] = num;
//             } else {
//                 odd[o++] = num;
//             }
//         }

//         System.out.print("Even array: ");
//         for (int i = 0; i < even.length; i++) {
//             System.out.print(even[i] + " ");
//         }

//         System.out.println();

//         System.out.print("Odd array: ");
//         for (int i = 0; i < odd.length; i++) {
//             System.out.print(odd[i] + " ");
//         }

//         sc.close();
//     }
// }




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prime = new int[n];
        int p = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;

            if (arr[i] < 2) {
                isPrime = false;
            }
            else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                prime[p++] = arr[i];
            }
        }

        for (int i = 0; i < p; i++) {
            System.out.print(prime[i] + " ");
        }

        sc.close();
    }
}