class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int value=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                value=nums[i];
            }
        }
        return value;
    }
}