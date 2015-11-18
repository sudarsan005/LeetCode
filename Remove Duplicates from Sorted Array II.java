/*Remove Duplicates from Sorted Array II
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/

public class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length<2)
            return nums.length;
        int i=1,j=2;
        while(j<nums.length)
        {
            if(nums[i]==nums[j] && nums[i]==nums[i-1])
            {
                j++;
            }
            else
            {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}