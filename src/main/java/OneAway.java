import java.util.HashSet;

public class OneAway {
  public boolean oneAway(String str1, String str2){
    HashSet<Character> obj = new HashSet<Character>();
    for (int i = 0; i < str1.length() ;i++ ) {
      obj.add(str1.charAt(i));
    }
    for (int j = 0; j < str2.length() ;j++ ) {
      obj.add(str2.charAt(j));
    }
    return (obj.size() - ((str1.length() < str2.length()) ? str1.length() : str2.length())) < 2;
  }
}


// JavaScript solution
//
// function oneAway(str1,str2){
//   var checker = 0;
//   if (str2.length + 1 < str2.length){
//     return false;
//   } else if (str2.length - 1 > str1.length){
//     return false;
//   } else {
//     for (var i = 0; i < str1.length; i++){
//       if (str1[i] != str2[i]){
//         checker++;
//       }
//     }
//     return checker < 2;
//   }
// }
