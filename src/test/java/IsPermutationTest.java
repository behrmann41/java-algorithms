import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPermutationTest{
  @Test
  public void permutationTest(){
    IsPermutation one = new IsPermutation("hello", "olelh");
    IsPermutation two = new IsPermutation("frog", "rgfo");
    IsPermutation three = new IsPermutation("happy", "bob");
    IsPermutation four = new IsPermutation("happy", "hapy");
    assertEquals(true, one.checkString());
    assertEquals(true, two.checkString());
    assertEquals(false, three.checkString());
    assertEquals(false, four.checkString());
  }
}
