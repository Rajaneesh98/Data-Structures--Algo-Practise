import java.sql.Array;

public class Rough {

    static int num =1;

    public static int[] printNos(int x,int[] arr) {
        // Write Your Code Here
        if (num > x) {
            return arr;
        }
        arr[num - 1] = num;
        num = num + 1;
        printNos(x, arr);
        return arr;
    }

    private static void basicPrint(int num,int x){
        if(num>x){
            return;
        }
        System.out.println(num);
        basicPrint(++num,x);
    }


    public static void main(String[] args) {
//        int[] arr = printNos(5);
//        for(int i : arr ){
//            System.out.println(i);
//        }

//        basicPrint(1,5);
        int num =5;
        int[] arr = new int[num];
        printNos(num,arr);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
