/*Maximum Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6*/

public class Solution {
    public int maxSubArray(int[] nums) 
    {
        if(nums.length==1)
            return nums[0];
        int max=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++)    
        {
            max=Math.max((nums[i]+max),nums[i]);
            sum=Math.max(sum,max);
        }
        
        return sum;
    }
}
