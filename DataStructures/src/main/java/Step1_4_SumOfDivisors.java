public class Step1_4_SumOfDivisors {

    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i=0; i<=n ; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
        }
        return sum;
    }

    private static  int better(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    sum=sum+j;
                    if(i/j!=j){
                        sum=sum+ (i/j);
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(5));
        System.out.println(better(5));
    }
}
