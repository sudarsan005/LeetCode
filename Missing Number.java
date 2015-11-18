/*Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.*//

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        //int mn = 0;
        for(int i = 0; i < n; i++)
        {
            sum=sum-nums[i];
        }
        return sum;
    }
}