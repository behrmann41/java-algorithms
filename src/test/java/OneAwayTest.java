import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OneAwayTest {
  @Test
  public void oneAway(){
    OneAway test = new OneAway();
    assertEquals(true, test.oneAway("pale", "ple"));
    assertEquals(true, test.oneAway("pales", "pale"));
    assertEquals(true, test.oneAway("pale", "bale"));
    assertEquals(false, test.oneAway("pale", "bake"));
  }
}
