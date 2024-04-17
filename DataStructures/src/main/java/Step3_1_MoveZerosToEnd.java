import java.util.Arrays;

public class Step3_1_MoveZerosToEnd {

    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public void moveZeroes(int[] nums) {
        int zeroPointer=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroPointer=i;
                break;
            }
        }
        int nonZeroPointer=zeroPointer+1;
        for(;nonZeroPointer<nums.length;){
            if(nums[nonZeroPointer]!=0){
                swap(nums,zeroPointer,nonZeroPointer);
                zeroPointer++;
                nonZeroPointer++;
            }else{
                nonZeroPointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,3,12};
        var obj = new Step3_1_MoveZerosToEnd();
        obj.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
