class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int  sum1=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        for(int j=0;j<n;j++)
        {
            sum-=nums[j];
        }
        return sum;
    }
}