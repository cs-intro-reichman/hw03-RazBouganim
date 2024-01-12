/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String ans = "";
        int i = 0;
        /*  when we iterate a finite number of times, like in a string or array we use for loops
            it is wrong here to use while
            example: for (int i=0;i< s.length();i++)
            */
        while(i < s.length()){
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90){
                ans = ans + (char)(ch + 32);
            }
            else{
                ans = ans + ch;
            }
            i++;
        }
        return ans;
    }
}
