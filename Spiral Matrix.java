/*Spiral Matrix
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.*/

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
       //int rowstrt=0,rowend=matrix.length,colstrt=0,colend=matrix[].length;
       List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return res;
        }
       
        int rowstrt= 0;
        int rowend = matrix.length-1;
        int colstrt = 0;
        int colend = matrix[0].length - 1;
       
      
       while(colstrt<=colend && rowstrt<=rowend)
       {
           //move right
           
           if(rowstrt<=rowend)
           {
               System.out.println("move right");
               for(int i=colstrt; i<=colend; i++)
               {
                   res.add(matrix[rowstrt][i]);
                   System.out.println((matrix[rowstrt][i]));
               }
               
           }
           rowstrt++;
           //move down
           
           if(colstrt<=colend)
           {
               System.out.println("move down");
               for(int j=rowstrt;j<=rowend;j++)
               {
                  res.add(matrix[j][colend]);
                  System.out.println((matrix[j][colend]));
               }
               
           }
           colend--;
           //move left
           
           if(rowstrt<=rowend)
           {
               System.out.println("move left");
               for(int i=colend;i>=colstrt;i--)
               {
                   res.add(matrix[rowend][i]);
                   System.out.println((matrix[rowend][i]));
               }
               
           }
           rowend--;
           // move up
           
           if(colstrt<=colend)
           {
               System.out.println("move up");
               for(int j=rowend;j>=rowstrt;j--)
               {
                   res.add(matrix[j][colstrt]);
                   System.out.println((matrix[j][colstrt]));
               }
               
           }
           colstrt++;
       }
       return res;
    }
}