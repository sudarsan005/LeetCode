/*Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0*/

public class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        if(nums.length==1)
        {
            if(nums[0]==target)
                return 0;
            else if(nums[0]>target)
                return 0;
            else 
                return 1;
        }
        return bsrch(nums,target,0,nums.length-1);
    }
    
    public int bsrch(int[] nums, int t, int lo, int hi)
    {
        
        int mid=(hi+lo)/2;
        if(lo>hi)
            return lo;
        if(nums[mid]==t)
            return mid;
        if(nums[mid]<t)
        {
            return bsrch(nums,t,mid+1,hi);
        }
        else
            return bsrch(nums,t,lo,mid-1);

    }
}