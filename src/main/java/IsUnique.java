import java.util.HashSet;

public class IsUnique {
  private String test;
  IsUnique(String str){
    test = str;
  }
  public boolean getString(){
    String[] testArr = test.split(" ");
    String strTest = String.join("", testArr);
    for (int i = 0; i < strTest.length() - 1; i++ ) {
      for (int j = i + 1; j < strTest.length() ; j++) {
        if (strTest.charAt(i) == strTest.charAt(j)){
          return false;
        }
      }
    }
    return true;
  }
}
  // solution with data structure
    // HashSet<Character> unique = new HashSet<Character>();
    // String[] arrTest = test.split(" ");
    // String strTest = String.join("", arrTest);
    // for (int i = 0; i < strTest.length() ;i++ ) {
    //   unique.add(strTest.charAt(i));
    // }
    // if(unique.size()!= strTest.length()){
    //   return false;
    // }
    // return true;
