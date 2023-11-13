package week_10_objectOrientedProgramind_2.exercise_10_23;

public class MyString2 {
   private String s;
   public MyString2(String s){
       this.s = s;
   }
   public int compare(String s){
       int counter = 0;
       for (int i = 0; i <Math.max( this.s.length(), s.length()); i++) {
         counter = this.s.charAt(i) - s.charAt(i);
         if (counter != 0){
             return counter;
         }
       }
       return 0;
   }
   public MyString2 subString(int begin){
       return new MyString2(s.substring(begin));
   }
   public MyString2 toUpperCase(){
       return new MyString2(s.toUpperCase());
   }
   public char[] toChars(){
       return s.toCharArray();
   }
   public static MyString2 valueOf(boolean b){
       return new MyString2(b + "");
   }
   public String toString(){
       return s;
   }
}
