import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UrlifyTest {
  @Test
  public void testUrlify(){
    Urlify one = new Urlify("Mr John Smith ");
    Urlify two = new Urlify(" hello my name is betty sue ");
    assertEquals("Mr%20John%20Smith", one.turnUrl());
    assertEquals("hello%20my%20name%20is%20betty%20sue", two.turnUrl());
  }
}
