package src.common;

public class Q41_FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int positives[] = new int[nums.length+1];

        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                int val = nums[i];
                if(val>0 && val<=nums.length){
                    positives[val]=1;
                }
            }
        }

        for(int i=1;i<positives.length;i++){
            if(positives[i]==0){
                return i;
            }
        }
        return positives.length;
    }
}
