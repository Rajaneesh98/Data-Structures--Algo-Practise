public class Step3_1_MaximumConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int onePointer=-1;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 1 && onePointer == -1) {
                onePointer = i;
            }
            if (nums[i] != 1 && onePointer != -1) {
                maxOnes = i - onePointer;
                onePointer=-1;
            }
        }
        System.out.println(onePointer);
        if(onePointer!=-1){
            maxOnes= Math.max(maxOnes,nums.length-onePointer);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        var obj = new Step3_1_MaximumConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}
