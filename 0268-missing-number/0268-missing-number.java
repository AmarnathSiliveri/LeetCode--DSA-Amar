class Solution {
    public int missingNumber(int[] nums)
    {
        int n=1;
        for(int i=2;i<=nums.length;i++)
        {
            n+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            n-=nums[i];
        }
        return n;
    }
}