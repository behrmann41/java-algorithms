import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RotateMatrixTest {
  @Test
  public void rotateMatrix(){
    RotateMatrix matrix = new RotateMatrix();
    int[][] original = {
      {1,2,3},
      {1,2,3},
      {1,2,3},
    };
    int[][] result = matrix.createMatrix(original);
    int[][] rotated = {
      {1,1,1},
      {2,2,2},
      {3,3,3}
    };
    assertArrayEquals(rotated, matrix.rotateRight(original));
  }
}
