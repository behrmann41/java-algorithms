import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ZeroMatrixTest {
  @Test
  public void TestMatrix(){
    ZeroMatrix test = new ZeroMatrix();
    int[][] original = {
      {1,1,0},
      {1,1,1},
      {1,1,1},
    };
    int[][] result = test.createMatrix(original);
    int[][] zeroed = {
      {0,0,0},
      {1,1,0},
      {1,1,0}
    };
    assertArrayEquals(zeroed, test.zeroOut(result));
  }
}
