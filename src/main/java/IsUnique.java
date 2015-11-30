import java.util.HashSet;

public class IsUnique {
  private String test;
  IsUnique(String str){
    test = str;
  }
  public boolean getString(){
    HashSet<Character> unique = new HashSet<Character>();
    String[] arrTest = test.split(" ");
    String strTest = String.join("", arrTest);
    for (int i = 0; i < strTest.length() ;i++ ) {
      unique.add(strTest.charAt(i));
    }
    if(unique.size()!= strTest.length()){
      return false;
    }
    return true;
  }
}
