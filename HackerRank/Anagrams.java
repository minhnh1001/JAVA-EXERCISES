package example;

/* Anagrams
Sample Input 1

anagram
margana
Sample Output 1:

Anagrams
Sample Input 2

anagramm
marganaa
Sample Output 2:

Not Anagrams
  */
import java.util.*;

public class Anagrams{
	 static boolean isAnagram(String A, String B) {
		 Boolean retValue = false;
		   if(A != null && B != null) {
		       char [] arrayA = A.toLowerCase().toCharArray();
		       char [] arrayB = B.toLowerCase().toCharArray();
		       Arrays.sort(arrayA);
		       Arrays.sort(arrayB);
		       retValue = Arrays.equals(arrayA, arrayB);
		   }
		   return retValue;
	 }
	public static void main (String[] args){

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
	}
}	
			


