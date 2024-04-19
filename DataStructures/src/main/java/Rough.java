import java.sql.Array;
import java.util.*;

public class Rough {

    public static void simplePrint(){
        ArrayList<Integer> arr  = new ArrayList<>(10);
        arr.add(1);
        arr.add(0, 3);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        simplePrint();
    }
}
