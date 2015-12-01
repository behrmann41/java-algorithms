public class Urlify {
  private String input;
  Urlify(String input){
    this.input = input;
  }
  public String turnUrl(){
    return input.trim().replace(" ", "%20");
  }
}
