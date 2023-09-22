package evennumbers;
import java.util.*;
public class EvenNumber {
 
		public static void main(String[] args) {
		int n;
		System.out.println("enter the limit upto which to find even numbers");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Printing Even numbers between 1 and " + n);
		
		for (int i = 1; i <= n; i++) {
		// if the number is divisible by 2 then it is even
		if (i % 2 == 0) {
		System.out.print(i + " ");
					}
				}
			}
		}
	
