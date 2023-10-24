
import java.util.Scanner;

public class B {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System .out.println("Enter the Roman value ");

        String romanString = input.next();

        int result = RomanToInteger(romanString);

        System.out.println("After Changing Roman to Integer  :" + result);


     }

     public static int RomanToInteger(String romaString) {
        int result = 0;
        for(int i=0; i<romaString.length();i++){
            int currentValue = romanconverter(romaString.charAt(i));
            if( i+1<romaString.length()){
                int nextValue = romanconverter(romaString.charAt(i+1));
                
                if(currentValue<nextValue){
                    result -= currentValue;
                }else{
                    result += currentValue;
                }
            }else{
                result += currentValue;
            }
        }
        return result;
     }

     public static int romanconverter(char roman){
        switch(roman){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; 
        
        }
     }
}
 