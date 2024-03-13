import java.util.ArrayList;
import java.util.List;

public class Step1_5SumOfFirst_N_Numbers {

    private static void forwardRecursionSumList(long n, List<Long> list){
        if(n<=0){
            return;
        }
        list.add(0, list.get(0)+n);
        forwardRecursionSumList(n-1,list);
    }

    private static long forwardRecursionSum(long n, long sum) {
        if (n <= 0) {
            System.out.println("base cond  " + sum);
            return sum;
        }
        sum = sum + n;
        System.out.println(sum);
        return forwardRecursionSum(n - 1, sum); // Update sum with the result of the recursive call
    }

    public static long sumFirstN(long n) {
        List<Long> list = new ArrayList<>();
        list.add(0l);
        long sum=0;
//        return forwardRecursionSum(n, sum);
        forwardRecursionSumList(n,list);
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstN(5));
    }
}
