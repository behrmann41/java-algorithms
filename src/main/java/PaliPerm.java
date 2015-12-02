import java.util.HashMap;

public class PaliPerm {
  public boolean testPaliPerm(String str){
    HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
    char letter;
    int num;
    int palidromeCheck = 0;
    CharSequence testStr = str.trim().replace(" ", "");
    for (int i = 0;i < testStr.length() ;i++ ) {
      num = obj.containsKey(testStr.charAt(i)) ? obj.get(testStr.charAt(i)) : 0;
      obj.put(testStr.charAt(i), (num + 1));
    }
    for (int value : obj.values()){
      palidromeCheck += value % 2;
    }
    return palidromeCheck < 2;
  }
}
