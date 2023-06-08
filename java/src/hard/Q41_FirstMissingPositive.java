package src.hard;

public class Q41_FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums= {1,2,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int ans[] = new int[nums.length+1];

        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                int val = nums[i];
                if(val>0 && val<=nums.length){
                    ans[val]=1;
                }
            }
        }

        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                return i;
            }
        }
        return ans.length;
    }
}
