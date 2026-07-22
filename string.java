public class string{
    public static void main(String arg[]){
        String str = "Programming";

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));

        for(int i =0 ; i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        for(int i =0 ; i<str.length();i++){
            if(i%2==0){
            System.out.println(str.charAt(i));
            }
        }
        for(int i = str.length()-1 ; i>=0; i--){
            System.out.print(str.charAt(i));
        }


    }
}