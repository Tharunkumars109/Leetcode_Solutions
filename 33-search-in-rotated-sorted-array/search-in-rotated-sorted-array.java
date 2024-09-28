class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int t=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                t=i;            }
        }
        if(t>=0)
        {
             return t;
        }
        else
        {
            return -1;
        }
    }
}