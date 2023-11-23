public class Verification {

    public static boolean palindrome(String s){
        int i;
        String temp="";
        String temp2="";

        for(i=0;i<s.length();i++) {
            if (s.charAt(i) != ' ') {
                temp = temp + s.charAt(i);
            }
        }

        for(i=s.length();i>=0;i--){
            if(s.charAt(i)!=' ') {
                temp2 = temp2 + s.charAt(i);
            }
        }
        return (temp==temp2);

    }
}
