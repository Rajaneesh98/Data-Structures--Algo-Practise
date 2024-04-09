import java.sql.Array;
import java.util.*;

public class Rough {

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
        int a =3;
        int[] num = new int[a];
        int count =0;
        System.out.println(simplePrint(a, count));
    }
}
