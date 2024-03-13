import java.util.ArrayList;
import java.util.List;

public class Step1_5PrintNTimesUsingRecursion {

    private static List<String> recusion(int n, List<String> list){
        if(n<=0){
            return list;
        }
        list.add("Coding Ninjas");
        n=n-1;
        recusion(n,list);
        return list;
    }

    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> list = new ArrayList<>();
        return recusion(n,list);
    }
    public static void main(String[] args) {
        System.out.println(printNtimes(4));
    }
}
