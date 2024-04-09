public class Step1_5_CalculateFibonacciNumber_UsingRecursion {

    public int fib(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        var ans = new Step1_5_CalculateFibonacciNumber_UsingRecursion();
        System.out.println(ans.fib(5));
    }
}
