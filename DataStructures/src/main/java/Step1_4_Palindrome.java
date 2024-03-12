public class Step1_4_Palindrome {

    public static boolean isPalindrome(int x) {
        StringBuilder stringBuilder  = new StringBuilder(Integer.toString(x));
        String ans = Integer.toString(x);

        stringBuilder.reverse();
        System.out.println(ans+"  "+stringBuilder);

        return ans.contentEquals(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}
