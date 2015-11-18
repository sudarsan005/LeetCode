/*Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

public class Solution {
    public int majorityElement(int[] num) {
        int count=1;
        int len=num.length;
        int max_len=len/2,max_ele=0;
        int prev=0;
        Arrays.sort(num);
        
        for (int i=0; i<len; i++)
        {
            if(i<=1)
            {
            prev=num[0];
            }
            if(prev==num[i])
            {
                count++;
                if(count>max_len)
                {
                    max_ele = prev;
                    //return num[i];
                }
                //break;
            }
            else
            {
                count =1;
            }
            prev=num[i];
        }
        return max_ele;
    }
}