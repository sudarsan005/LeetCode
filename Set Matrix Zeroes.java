/*Set Matrix Zeroes
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.*/

public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fc=false,fr=false;
        
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
            fr=true;
        }
        
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[0][j]==0)
            fc=true;
        }
        
        for(int i=1; i<matrix.length;i++)
        {
            for(int j=1; j<matrix[0].length;j++)
            {
                    if(matrix[i][j] == 0)
                    {
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                    //matrix[i][j] = 0;
            }
        }
        for(int i=1; i<matrix.length;i++)
        {
            for(int j=1; j<matrix[0].length;j++)
            {
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                        ///matrix[0][j]=0;
                    }
                    //matrix[i][j] = 0;
            }
        }
        
        
        if(fr)
        {
            for(int i=0;i<matrix.length;i++)
            {
            matrix[i][0]=0;
            //fr=true;
            }
        }
        if(fc)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
            matrix[0][j]=0;
            //fr=true;
            }
        }
        
    }
}