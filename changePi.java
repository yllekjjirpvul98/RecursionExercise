/*

Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

*/

public String changePi(String str) {
  if (str.equals("pi")) return "3.14";
  else if (str.length() > 2) {
    if (changePi(str.substring(0,2)).equals("3.14")) return changePi(str.substring(0,2)) + changePi(str.substring(2));
    else return changePi(str.substring(0,1)) + changePi(str.substring(1));
  }
  else return str;
}
