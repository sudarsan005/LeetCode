/*Merge Sorted Array
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.*/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=m+n-1,i=m-1,j=n-1;
        while(i>=0 || j>=0)
        {
            if(i>=0 && j>=0)
            {
                nums1[index--]=(nums1[i]>=nums2[j]) ? nums1[i--] : nums2[j--];
                //nums1[index--]=(nums1[i]>=nums2[j]) ? nums1[i--] : nums2[j--];
            }
            else 
            {
                while (i>=0)
                {
                    nums1[index--]=nums1[i--];
                }
                while (j>=0)
                {
                    nums1[index--]=nums2[j--];
                }
            }
            
        }
    }
}