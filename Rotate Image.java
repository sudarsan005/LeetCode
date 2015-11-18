/*Rotate Image
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).*/

public class Solution {
    public void rotate(int[][] matrix) {
     int temp;
     // transpose the matrix
     for(int i=0;i < matrix.length;i++)
     {
         for(int j=i;j<matrix[0].length;j++)
         {
             temp=0;
             temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
         }
     }
     
     //flip the matrix
     for(int i=0;i<matrix.length;i++)
     {
         for(int j=0; j<matrix.length/2;j++)
         {
             temp=0;
             temp=matrix[i][j];
             matrix[i][j]=matrix[i][matrix.length-1-j];
             matrix[i][matrix.length-1-j]=temp;
         }
     }
    }
}