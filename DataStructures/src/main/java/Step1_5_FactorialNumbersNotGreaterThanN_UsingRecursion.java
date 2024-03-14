import java.util.ArrayList;
import java.util.List;

public class Step1_5_FactorialNumbersNotGreaterThanN_UsingRecursion {

    private static long returnsFactorial(long n){
        if(n==1){
            return 1;
        }
        return n*returnsFactorial(n-1);
    }

    private static List<Long> factorialNumberHelper(long i,long n, List<Long> list){
        if(i<1){
            return list;
        }
        long val = returnsFactorial(i);
        if(val<=n){
            list.add(val);
        }
        return factorialNumberHelper(i-1,n,list);
    }

    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<>();
        return factorialNumberHelper(n,n,list);
    }

    public static void main(String[] args) {
//        System.out.println(returnsFactorial(1));
        System.out.println(factorialNumbers(2));
    }
}
