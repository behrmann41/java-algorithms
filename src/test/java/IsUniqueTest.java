import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsUniqueTest {
  @Test
  public void uniqueString(){
    IsUnique one = new IsUnique("hello");
    IsUnique two = new IsUnique("yes");
    IsUnique three = new IsUnique("helo biq ");
    assertEquals(false, one.getString());
    assertEquals(true, two.getString());
    assertEquals(true, three.getString());
  }
}
