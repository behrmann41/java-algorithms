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
  public int[][] rotate(int[][] m){
    for (int  j = 0; j < m[0].length/2; j++) {
      for (int i = 0; i < m.length; i++) {
          int x = m[i][j];
          m[i][j] = m[i][m[0].length -1 -j];
          m[i][m[0].length -1 -j] = x;
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
