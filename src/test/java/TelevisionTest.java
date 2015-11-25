import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TelevisionTest {
  @Test
  public void isOffByDefault() {
    Television tv = new Television();
    assertEquals(false, tv.isOn());
  }
}
