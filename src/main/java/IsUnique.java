import java.util.HashSet;

public class IsUnique {
  private String test;
  IsUnique(String str){
    test = str;
  }
  public boolean getString(){
    HashSet<Character> unique = new HashSet<Character>();
    for (int i = 0; i < test.length() ;i++ ) {
      unique.add(test.charAt(i));
    }
    if(unique.size()!= test.length()){
      return false;
    }
    return true;
  }
}
