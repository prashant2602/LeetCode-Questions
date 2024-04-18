class Solution {
    public void setZeroes(int[][] matrix) {
        int col_len=matrix[0].length;
        int row_len=matrix.length;
        int row[]=new int[row_len];
        int col[]=new int[col_len];
        for(int i=0;i<col_len;i++){
            col[i]=0;
        }
        for(int i=0;i<row_len;i++){
            row[i]=0;
        }
        for(int i=0;i<row_len;i++){
            for(int j=0;j<col_len;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row_len;i++){
            for(int j=0;j<col_len;j++){
                if(row[i]==1){
                    matrix[i][j]=0;
                }
                if(col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
