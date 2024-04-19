public class Step3_1_FindUniqueNumberInArray {

    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0 ;i<nums.length; i++){
            res=res^nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2};
        var obj = new Step3_1_FindUniqueNumberInArray();
        System.out.println(obj.singleNumber(arr));
    }
}
