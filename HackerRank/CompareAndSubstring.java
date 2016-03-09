package example;

/* Compare to String
Sample Input

 hello
 java
Sample Output

9
No
Hello Java
Explanation

String AA is "hello" and BB is "java". 
AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is NO. 
When you capitalize the first letter of both AA and BB and then print them separated by a space, you get "Hello Java".
  */
import java.util.*;

public class CompareAndSubstring{
	
	public static void main (String[] args){

		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int n = A.length();
	        int k = B.length();
	        System.out.println(n+k);
	        if (A.compareTo(B) > 0) {
				System.out.println("Yes");
			}
	        else {
				System.out.println("No");
			}
	        A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	        B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	        System.out.println(A + " " + B);
	    }	
}			


