# priyasss
public class StringConcat{
  int counter; 
  String str1 = "FirstString";
  String str2 = "SecondString";
  public int countingLength(String str){
    char[] strToCharArray = str.toCharArray();
    for(char temp : strToCharArray){
     counter++;
    }    
  }

 
 char[] charArray1 = str1.tocharArray();
 char[] charArray2 = str1.tocharArray();

 
 char[] charContainer=new char[counter];


  for(int i=0; i<charContainer.length; i++) {

      if(charArray1 != null){
        charContainer[i] +=  charArray1[i];
      } else 
        return charArray2; 
  }  

  //for storing charArray2 into charContainer
  for(int i=0; i<charContainer.length; i++) {

      if(charArray2 != null){
        charContainer[i] +=  charArray1[i];
      } else 
        return charArray1; 
  }  

  
  String strContainer = new String(charContainer);

 public static void main(String args[]){


   System.out.println("String Container : " +strContainer);  
 }  

}
