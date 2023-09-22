package palindrome;
import java.util.*;
public class Palindrome {

	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n; //It is the number variable to be checked for palindrome
		System.out.println("enter the number");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		temp = n;
		while (n > 0) {
		r = n % 10; //getting remainder
		sum = (sum * 10) + r;
		n = n / 10;
		}
		if (temp == sum)
		System.out.println("it is a palindrome number ");
		else
		System.out.println("it is not palindrome");
	}
}
