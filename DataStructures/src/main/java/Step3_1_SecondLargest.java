public class Step3_1_SecondLargest {

    public static int[] getSecondOrderElements(int n, int []a) {
        int largest = a[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i=1; i<a.length; i++){
            if( a[i] > largest){
                secLargest=largest;
                largest=a[i];
            }else if(a[i]<largest && a[i]>secLargest){
                secLargest=a[i];
            }
        }
        int smallest = a[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=1; i<a.length; i++){
            if( a[i] < smallest){
                secSmallest=smallest;
                smallest=a[i];
            }else if(a[i]>smallest && a[i]<secSmallest){
                secSmallest=a[i];
            }
        }
        return new int[]{secLargest,secSmallest};
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,9,13,10,1};
        System.out.println(getSecondOrderElements(arr.length,arr));
    }
}
