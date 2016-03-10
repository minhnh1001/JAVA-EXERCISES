package example;

/* Compare to String
Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length 3:

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.

Submissions: 10501
Max Score: 10

  */
import java.util.*;

public class CompareToString{
	
	public static void main (String[] args){

		Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int k=sc.nextInt();
	    String max=a.substring(0,k);
	    String min=a.substring(0,k);

	    for(int i=0; i+k<=a.length(); i++){           
	        if(a.substring(i, i+k).compareTo(min)<0) min=a.substring(i, i+k);
	        if(a.substring(i, i+k).compareTo(max)>0) max=a.substring(i, i+k);
	    }

	    System.out.println(min);
	    System.out.println(max);
	}
}	
			


