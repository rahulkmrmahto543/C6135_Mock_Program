package assignmentclass;
import java.util.Arrays;
public class Angramsexample {

		  public static void main(String[] args) {
		    String str = "Rahul";
		    String str1 = "Luhar";
		    
		    str = str.toLowerCase();
		    str1 = str1.toLowerCase();

		    //to check if length is same
		    if(str.length() == str1.length()) {

		      // to convert strings to char array
		      char[] charArray1 = str.toCharArray();
		      char[] charArray2 = str1.toCharArray();

		      //to sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(str + " and " + str1 + " are anagram.");
		      }
		      else {
		        System.out.println(str + " and " + str1 + " are not anagram.");
		      }
		     
		  }
		    else {
		        System.out.println(str + " and " + str1 + " are not anagram.");
		      }  
		}
}
