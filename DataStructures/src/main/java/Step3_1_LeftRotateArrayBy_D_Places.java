import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Step3_1_LeftRotateArrayBy_D_Places {

    private static void rotation(ArrayList<Integer> arr, int start, int end){
        for(int i=start, j=end; i<j; i++,j--){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
    }

    public static ArrayList<Integer> rotateArrayAnotherApproach(ArrayList<Integer> arr, int k){
        if(k > arr.size()){
            k = k % arr.size();
        }
        rotation(arr,0,k-1);
        rotation(arr,k,arr.size()-1);
        rotation(arr,0,arr.size()-1);
        return arr;
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        if(k > arr.size()){
            k = k % arr.size();
        }
        int[] tempArr = new int[k];
        for(int i=0; i<k; i++){
            tempArr[i]= arr.get(i);
        }
        for(int i=k; i<arr.size(); i++){
            arr.set(i-k,arr.get(i));
        }
        int pos = arr.size()-k;
        for(int i= pos; i< arr.size(); i++){
            arr.set(i,tempArr[i-pos]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr= {4,3,2,7,1,8,9};
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(arr));
//        IntStream.range(0, 10).forEach(i -> arrayList.add(i));
        System.out.println(rotateArrayAnotherApproach(arrayList, 3));
    }
}
