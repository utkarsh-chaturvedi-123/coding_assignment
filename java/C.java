
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter the input string : ");
        String str = input.nextLine();
        
        boolean flag = true;
       for(char ch='a'; ch<='z'; ch++) { 
        
         boolean pangram = checkPangram(ch, str);
         if(pangram == false) {
            flag = false;
            break;
         } 
       }
       if(flag) {
        System.out.println("input string is pangram");
       } else {
            System.out.println("input string is not pangram");
       }
    }

    public static boolean checkPangram(char ch, String str) {
        String strcpy = removeSpace(str).toLowerCase();
        for(int c = 0; c < strcpy.length(); c++) {
            if(ch == strcpy.charAt(c)) {
                return true;
            }
        }
        return false;
    }

    public static String removeSpace(String str) {
        String strCopy = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                strCopy += str.charAt(i);
            }  
        }
        return strCopy;
    }
}
