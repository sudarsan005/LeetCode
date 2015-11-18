/*Pascal's Triangle

Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();

        //if(numRows <= 0)
          //  return res;
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        res.add(pre);
        
        for(int i=2; i< numRows; i++)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j=0; j<i; j++)
            {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);//last
 
		res.add(cur);
		pre = cur;
        }
        
        return res;
    }
}



