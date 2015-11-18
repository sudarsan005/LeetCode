/*Unique Paths II
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.
*/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        obstacleGrid[0][0]^=1;
        for(int i=1;i<m;i++)
        {
            if(obstacleGrid[i][0]==0)
                obstacleGrid[i][0]=obstacleGrid[i-1][0];
            else
                obstacleGrid[i][0]=0;
        }
        
        for(int j=1;j<n;j++)
        {
            if(obstacleGrid[0][j]==0)
                obstacleGrid[0][j]=obstacleGrid[0][j-1];
            else
                obstacleGrid[0][j]=0;
        }
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(obstacleGrid[i][j]!=1)
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                else
                    obstacleGrid[i][j]=0;
            }
        }
        
        return obstacleGrid[m-1][n-1];
    }
}