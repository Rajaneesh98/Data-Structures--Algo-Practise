public class Step1_5Factorialof_N_Number_UsingRecursion {

    private static long FunctionFactorialNumber(long n){
        if(n==1){
            return n;
        }
        return n*FunctionFactorialNumber(n-1);
    }


    public static long factorialNumbers(long n, long ans) {
        // Write Your Code Here
        if(n==1){
            System.out.println(ans);
            return ans;
        }
        ans=ans*n;
        return factorialNumbers(n-1,ans);
    }

    public static void main(String[] args) {
        factorialNumbers(5,1);
//        System.out.println(FunctionFactorialNumber(5));
    }

}
