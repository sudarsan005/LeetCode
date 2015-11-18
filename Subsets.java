/*Subsets
Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.*/

public class Solution {
    public List<List<Integer>> subsets(int[] S) 
    {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    res.add(new ArrayList<Integer>());
    Arrays.sort(S);
    for(int i = S.length - 1; i >= 0; i--)///n
    {
        int size = res.size() - 1;
        // Refresh res array size
        for(int j = size; j >= 0; j--)///
        {
            List<Integer> newList1 = new ArrayList<>();
            newList1.add(S[i]);
            newList1.addAll(res.get(j));
            res.add(newList1);
        }
        
    }
    return res;
    }
}