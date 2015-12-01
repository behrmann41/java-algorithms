import java.util.Arrays;

public class IsPermutation{
  private String str1;
  private String str2;
  IsPermutation(String str1, String str2){
    this.str1 = str1;
    this.str2 = str2;
  }
  public boolean checkString(){
    if (str2.length()!= str1.length()){
      return false;
    } else {
      String[] str1Arr = str1.split("");
      String[] str2Arr = str2.split("");
      Arrays.sort(str1Arr);
      Arrays.sort(str2Arr);
      return Arrays.equals(str1Arr, str2Arr);
    }
  }
}
