package example;
/* End of File
"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read nn lines of input until you reach EOF, then number and print all nn lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown nn lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input:

k This is the line read as input for line number 'k'.
Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
  */
import java.util.*;

public class EndofFile{
	public static void main (String[] args){
		
		Scanner sa= new Scanner(System.in);

	    StringBuffer s=new StringBuffer();
	    int i=1;

	    while (sa.hasNext()){

	          s=s.append(i).append(" ").append(sa.nextLine()).append("\n");
	          i++;
	    }

	   System.out.print(s);
	}			
}

