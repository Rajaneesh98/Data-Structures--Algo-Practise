import java.util.Arrays;

public class Step1_5Print_N_To_1_usingRecursion {

    private static void backwardRecursion(int i, int n){
        if(i>n){
            return;
        }
        backwardRecursion(i+1,n);
        System.out.println(i);
    }

    private static void forwardRecursion(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        forwardRecursion(n-1);
    }

    private static int[] arrayForwardRecursion(int pos,int n, int[] arr ){
        if(n<=0){
            return arr;
        }
        arr[pos]=n;
        arrayForwardRecursion(pos+1,n-1,arr);
        return arr;
    }

    private static int[] arrayBackwardRecursion(int n, int[] arr){
        if(n<=0){
            return arr;
        }
        arrayBackwardRecursion(n-1,arr);
        arr[arr.length-n]=n;
        return arr;
    }


    public static void main(String[] args) {
        int n=5;
        forwardRecursion(n);
        System.out.println("______________________");
        backwardRecursion(1,n);
        int[] arr = new int[n];
        System.out.println(Arrays.toString(arrayForwardRecursion(0,n,arr)));
        System.out.println(Arrays.toString(arrayBackwardRecursion(n,arr)));
    }
}
