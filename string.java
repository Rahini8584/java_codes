import java.util.Scanner;
public class string{
    public static void main(String arg[]){ 
        
        // String str = "Programming";

        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(str.length()-1));

        // for(int i =0 ; i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }

        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());

        // for(int i =0 ; i<str.length();i++){
        //     if(i%2==0){
        //     System.out.println(str.charAt(i));
        //     }
        // }
        // for(int i = str.length()-1 ; i>=0; i--){
        //     System.out.println(str.charAt(i));
        // }


        //     System.out.println(str.substring(2));
        //     System.out.println(str.substring(0,6));
        //     System.out.println(str.concat(" in java "));
        //     System.out.println(str.equals("programming"));
        //     System.out.println(str.equalsIgnoreCase("programming"));

        //     System.out.println("apple".compareTo("banana"));

        // String str = "rahini";
        // String reversestr = "";
        // for(int i = 0 ; i<=str.length()-1;i++){
        //     reversestr = reversestr + str.charAt(str.length()-1-i);
        // }
        // System.err.println(reversestr);
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        string.fxn(str);
        sc.close();

        
    }
    static void fxn(String s){
        int vowel = 0; 
        int consonants = 0 ;
        String str= s.toLowerCase();
        for(int i = 0 ; i<str.length()-1;i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                vowel++;

            }     
            else{
                consonants++;

            }  
        }
        System.out.println("total vowels in the string are : "+vowel);
        System.out.println("total consonants in the string are : "+consonants);

    }
}