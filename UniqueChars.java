/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        int i = 1;
        int j = 0;
        String ans = "" + s.charAt(0);
        while(i < s.length()){
            char ch = s.charAt(i);
            if (ch == ' '){
                ans = ans + ch;
            }
            else {
                while (j < ans.length() && ans.charAt(j) != ch){
                    j++;
                }
                if (j == ans.length()){
                    ans = ans + ch;
                }
                j = 0;
            }
            i++;
        }
        return ans;
    }
}