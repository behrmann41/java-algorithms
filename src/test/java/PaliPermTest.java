import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaliPermTest{
  @Test
  public void paliPerm(){
    PaliPerm one = new PaliPerm();
    assertEquals(true, one.testPaliPerm("taco cat"));
    assertEquals(true, one.testPaliPerm("atco cta"));
    assertEquals(false, one.testPaliPerm("racedcar"));
    assertEquals(true, one.testPaliPerm("racecar"));
    assertEquals(true, one.testPaliPerm("tannat"));
  }
}
