/*Pascal's Triangle II
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex+1];
        Arrays.fill(arr,0);
        arr[0]=1;
        for(int i=1; i<=rowIndex; i++)
        {
            for(int j=i;j>0;j--)
            {
                arr[j]=arr[j]+arr[j-1];
            }
        }
        return Arrays.asList(arr);
    }
}