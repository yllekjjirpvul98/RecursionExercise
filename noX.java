

// Given a string, compute recursively a new string where all the 'x' chars have been removed.


// noX("xaxb") → "ab"
// noX("abc") → "abc"
// noX("xx") → ""



public String noX(String str) {
  if (str.equals("x")) return "";
  else if (str.length() > 1) return noX(str.substring(0,1)) + noX(str.substring(1));
  else return str;
}
