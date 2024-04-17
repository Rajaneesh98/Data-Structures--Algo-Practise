import java.sql.Array;
import java.util.*;

public class Rough {

    static int[] num = new int[4];

    static List<Integer> arr  = new ArrayList<>();

    public static int simplePrint(int num, int count){
        if(num<=0){
            return count;
        }
        count = count + num;
        System.out.println(count);
        return  simplePrint(num-1,count);
    }

    public static void main(String[] args) {
        for(int i : num) System.out.println(i);
    }
}
