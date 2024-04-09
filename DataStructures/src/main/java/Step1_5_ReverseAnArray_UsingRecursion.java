public class Step1_5_ReverseAnArray_UsingRecursion {

    private static int[] reverseArrayHelper(int start, int end, int[] nums){
        if(start>=end){
            return nums;
        }
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        return reverseArrayHelper(start+1,end-1, nums);
    }


    public static int[] reverseArray(int n, int [] nums) {
        // Write your code here.
       return reverseArrayHelper(0,n-1,nums);
    }

    public static void main(String[] args) {
        int[] ans = reverseArray(5, new int[]{1, 2, 3, 4, 5});
        for(int i : ans){
            System.out.println(i);
        }
    }
}
