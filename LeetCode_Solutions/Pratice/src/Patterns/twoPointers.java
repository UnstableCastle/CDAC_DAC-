package Patterns;

/**
 * Recusion
 */
public class twoPointers {

  public static boolean isPal(String s ){

      int left =0;
      int right = s.length()-1;

      while(left<right){
          if(s.charAt(left) != s.charAt(right)){
              return false;
          }
          left+=1;
      right-=1;
      }
      
  return true ;
  }
    
    public static void main(String[] args) {
        String n = "hello";
        System.out.println(isPal(n));
    
    }} 