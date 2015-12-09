public class ZeroMatrix {
  public int[][] createMatrix(int[][] n){
    for(int i = 0; i < n.length; i++){
      for (int j = 0; j < n[0].length ; j++ ) {
        int x = n[i][j];
        n[i][j] = n[j][i];
        n[j][i] = x;
      }
    }
    return n;
  }
  public int[][] zeroOut(int[][] matrix){
    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];
    for (int i = 0;i < matrix.length ;i++ ) {
      for (int j = 0;j < matrix[0].length ;j++ ) {
        if (matrix[i][j] == 0){
          row[i] = true;
          col[j] = true;
        }
      }
    }
    for (int i = 0; i < row.length ;i ++ ) {
      if (row[i]) zeroRow(matrix, i);
    }
    for (int j = 0;j < col.length ;j++ ) {
      if (col[j]) zeroCol(matrix, j);
    }
    return matrix;
  }
  public void zeroRow(int[][] matrix, int row){
    for (int j = 0; j < matrix[0].length; j++){
      matrix[row][j] = 0;
    }
  }
  public void zeroCol(int[][] matrix, int col){
    for (int i = 0 ;i < matrix.length; i++ ) {
      matrix[i][col] = 0;
    }
  }
}
