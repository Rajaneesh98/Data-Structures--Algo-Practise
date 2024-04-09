public class Step1_5_PalindromeCheck_UsingRecursion {

    private static boolean better(int left, int right, String str){
        if(left>=right){
            return true;
        }

        if(str.charAt(left)==str.charAt(right)){
            return better(left+1,right-1,str);
        }else{
            return false;
        }
    }

    private static boolean isPalindromeHelper(String temp, String str, int len) {
        if(len<0){
            if(temp.equals(str)){
                return true;
            }
            return false;
        }
        temp=temp+str.charAt(len);
        return isPalindromeHelper(temp,str,len-1);
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        String temp = "";
//        return isPalindromeHelper(temp,str,str.length()-1);
        return better(0,str.length()-1,str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }
}
