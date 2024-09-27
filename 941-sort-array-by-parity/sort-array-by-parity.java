class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int c=0;
        int a=n-1;
        int[] arr=new int[n];
        //int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
           if(nums[i]%2==0)
           {
               arr[c]+=nums[i];
               c++;
           }
           else
           {
            arr[a]+=nums[i];
            a--;
           }
        }
        return arr;
    }
}