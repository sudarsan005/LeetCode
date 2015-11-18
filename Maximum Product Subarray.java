/*Maximum Product Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.*/

public class Solution {
    public int maxProduct(int[] nums) 
    {
        int max_ao=nums[0],min_ao=nums[0],max=nums[0],max_ao_prev=nums[0],min_ao_prev=nums[0];
        if(nums.length==1)
            return nums[0];
        for(int i=1;i<nums.length;i++ )
        {
            max_ao=Math.max(nums[i],Math.max(nums[i]*max_ao_prev,min_ao_prev*nums[i]));
            min_ao=Math.min(nums[i],Math.min(nums[i]*max_ao_prev,min_ao_prev*nums[i]));
            max=Math.max(max,max_ao);
            max_ao_prev=max_ao;
            min_ao_prev=min_ao;
            
        }
        return max;
        
    }
}

