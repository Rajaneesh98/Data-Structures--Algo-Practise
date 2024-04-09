import java.util.ArrayList;
import java.util.List;

public class Step1_5_FibonacciSeriesPrint_UsingRecursion {

    private static int[] anotherApproach(int start, int n, int[] list){
        if(start >=n ){
            return list;
        }
        list[start]=list[start-1]+list[start-2];
        System.out.println("----"+list[start]);
        return anotherApproach(start+1,n,list);
    }

    private static List<Integer> generateFibonacciNumbersHelper(int start, int next, int n, List<Integer> li) {
        // Write your code here.
        if(li.size() >=n ){
            return li;
        }
        int temp= li.get(start)+li.get(start+1);
        li.add(next,temp);
        return generateFibonacciNumbersHelper(start+1, next+1,n,li);
    }

    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
//        List<Integer> li = new ArrayList<>();
//        li.add(0);
//        li.add(1);
//        return generateFibonacciNumbersHelper(0,2,n ,li);

        int[] list = new int[n];
        list[0]=0;
        if(n==0){
            return list;
        }
        list[1]=1;
        if (n==1) {
            return list;
        }
        return anotherApproach(2,n,list);
    }

    public static void main(String[] args) {
//        System.out.println(generateFibonacciNumbers(10));
        int[] ans = generateFibonacciNumbers(8);
        for(int i : ans){
            System.out.print(i +" ");
        }
    }

}
