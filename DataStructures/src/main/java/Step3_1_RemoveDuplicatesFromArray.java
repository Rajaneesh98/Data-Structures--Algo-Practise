import java.util.Arrays;
import java.util.HashSet;

public class Step3_1_RemoveDuplicatesFromArray {

    private static void swap(int[] arr,int i ,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int removeDuplicatesAnotherApproach(int[] arr, int n){
        int pointer=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[pointer]){
                arr[pointer+1]=arr[i];
                pointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return pointer+1;
    }

    public static int removeDuplicates(int[] arr,int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hashSet.add(arr[i]);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(removeDuplicatesAnotherApproach(arr,arr.length));
    }
}
