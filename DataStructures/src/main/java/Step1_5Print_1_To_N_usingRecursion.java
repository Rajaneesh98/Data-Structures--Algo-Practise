public class Step1_5Print_1_To_N_usingRecursion {

    private static void backwardRecursion(int n){
        if(n<=0){
            return;
        }
        backwardRecursion(n-1);
        System.out.println(n);
    }

    private static void forwardRecursion(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        forwardRecursion(i+1,n);
    }


    public static void main(String[] args) {
        int n=5;
        forwardRecursion(1,n);
        System.out.println("________________");
        backwardRecursion(n);
    }
}
