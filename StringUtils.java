class StringUtils {

  static boolean containsChar(String word,char letter){
  for(int i=0;i<word.length();i++){
    if( word.charAt(i) == letter){
      return true;
    }
    
  }
  return false;
}

 static String reverse(String text){
  String temp = "";
  for(int i = text.length()-1;i>=0;i--){
   temp += text.charAt(i);
  }
  return temp;
 }

 static String replaceAll(String text, char oldChar, char newChar){
  return text.replace(oldChar,newChar);
 }

}