package JavaPrgs;
//Importing Java.util Package to use Scanner class
import java.util.*;
public class Longest_Palindrome_Series_Present_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str , newStr , maxString = "";
        System.out.println("Enter any string :: ");
        str = sc.next().trim().toLowerCase();
        int len = str.length();
        ArrayList<String> subStrings = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            newStr = "";
            for(int j = i; j < len ; j++ ){
                newStr += str.charAt(j);
                if(isPalin(newStr))
                    subStrings.add(newStr);
            }
        }
        for(int i = 0 ; i < subStrings.size() ; i++){
            if(maxString.length() < subStrings.get(i).length()){
                maxString = subStrings.get(i);
            }
        }

        System.out.println(subStrings);
        System.out.println(maxString);
        sc.close();
    }
    public static boolean isPalin(String x){
        String rev = "";
        for(int i = x.length() - 1 ; i >= 0 ; i--){
            char c = x.charAt(i);
            rev += c;
        }
        if(rev.equals(x))
            return true;
        return false;
    }
}
