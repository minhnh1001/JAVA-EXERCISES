package hackerrank;

/* Java Loops

In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
Input Format

The first line will contain the number of integers, t. Each of the next t lines will have three integers, a, b, and n.

Constraints:

0≤a,b≤50
1≤n≤15
Output Format

Print the answer to each test case in seperate lines.
*/


import java.util.*;
/*
public class JavaLopps {
	int temp=0;
	static int temp2=0;
	static void printResultst(int a, int b,int n) {
		for(int i=0; i<n; i++){
			int temp=0;
			temp2+=(int)(Math.pow(2.0,i)*b);
			/*for(int j=0; j<=i; j++){
				temp=temp+(int)(Math.pow(2.0,j)*b);
			}*/
			temp=temp2+a;
            System.out.print(temp + " ");	
		}
		System.out.println("");
	}
*/

public class JavaLopps {
    static void printResults(int a, int b, int n)
    {
       
        int tempAnswer = 0;
        for(int i = 0; i<n;i++){
            tempAnswer = 0;
            for(int j = 0;j<=i;j++){ 
                tempAnswer = tempAnswer +(int)(Math.pow(2.0,j)*b);
            }
            tempAnswer+=a;
            System.out.print(tempAnswer + " ");
        }
        System.out.print("\n");
        
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i = 0;i<numCases;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            printResults(a,b,n);
            
        }
    }
}
