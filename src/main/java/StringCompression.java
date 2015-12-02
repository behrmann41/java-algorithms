import java.util.Arrays;

public class StringCompression {
  public String compress(String str){
    String output = "";
    int counter = 0;
    for (int i = 0;i < str.length(); i++) {
      counter++;
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
        output += "" + str.charAt(i) + counter;
        counter = 0;
      }
    }
    return (output.length() > str.length()) ? str : output;
  }
}
