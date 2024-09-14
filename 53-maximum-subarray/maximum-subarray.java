class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=nums[0];     
        for(int i : nums)
        {
            if(sum<0)
            {
                sum=0;
            }
            sum+=i;
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}