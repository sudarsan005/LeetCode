/*Remove Duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=0;
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        
       while(i<nums.length)
        {
            if(nums[i]==nums[j])
            {
              i++;
            }
            else
            {
                j++;
                nums[j]=nums[i];
                i++;
            }
        }
        //j=j+2;
        return j+1;
    }
}