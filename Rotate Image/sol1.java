class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int mat[][]=new int[len][len];
        int n=len-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                mat[j][n]=matrix[i][j];
            }
            n--;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]=mat[i][j];
            }
        }
    }
}
