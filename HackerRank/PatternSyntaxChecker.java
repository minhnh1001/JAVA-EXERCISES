package example;
/* Pattern Syntax Checker
 Input Format

The first line of input contains an integer NN, denoting the number of testcases. 
The next NN lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print "Valid" if the syntax of the given pattern is correct. 
Otherwise, print "Invalid". Do not print the quotes.
  */
import java.util.*;
import java.util.regex.*;
public class PatternSyntaxChecker{
	public static void main (String[] args){
		
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	       // or int testCases = in.nextInt(); String test = in.nextLine();
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	         testCases--;
	         PatternSyntaxException exc = null;
	         try {
	             Pattern.compile(pattern);
	         } catch (PatternSyntaxException e) {
	                 exc = e;
	             }
	                 if (exc != null) {
	                     System.out.println("Invalid");
	                 } else {
	                     System.out.println("Valid");
	                     }
	}
	}
}
