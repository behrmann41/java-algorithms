import java.util.Arrays;

public class RotateMatrix {
  public int[][] createMatrix(int[][] n){
    for (int i = 0;i < n.length ;i++ ) {
      for (int j=0;j<n[0].length ;j++ ) {
        int x = n[i][j];
        n[i][j] = n[j][i];
        n[j][i] = x;
      }
    }
    return n;
  }
  public int[][] rotateRight(int[][] m){
    int n = m.length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - i - 1; j++) {
          int x = m[i][j];
          m[i][j] = m[n - j - 1][i];
          m[n - j - 1][i] = m[n - 1 - i][n - 1 - j];
          m[n - 1 - i][n - 1 - j] = m[j][n - 1 - i];
          m[j][n - 1 - i] = x;
      }
    }
    return m;
  }
}

// class Matrix {
//   public static void main(String[] args){
//     RotateMatrix matrix = new RotateMatrix();
//     int[][] original = {
//       {1,2,3},
//       {1,2,3},
//       {1,2,3},
//     };
//     int[][] result = matrix.createMatrix(original);
//     for (int[] row : result ) {
//       System.out.println(Arrays.toString(row));
//     }
//   }
// }
