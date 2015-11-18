/*Minimum Size Subarray Sum
Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.*/

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum=0,len=0,min=Integer.MAX_VALUE,j=0; //INEGER_MAX;
        //nums.sort;
        if(nums==null || nums.length==0)
            return 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=s)
            {
                return 1;
            }
            sum=sum+nums[i];
            //len=len+1;
            while(sum>=s)
            {   
                min=Math.min(min,i-j);
                sum-=nums[j++];
                //j++;
            }

        }
        
        if(min==Integer.MAX_VALUE)
        return 0;
        else
        return min+1;
    }
}