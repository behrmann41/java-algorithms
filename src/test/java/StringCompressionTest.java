import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompressionTest {
  @Test
  public void strCompTest(){
    StringCompression one = new StringCompression();
    assertEquals("a2b1c5a3", one.compress("aabcccccaaa"));
  }
}
