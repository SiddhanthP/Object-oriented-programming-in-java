package Factorial;
import java.util.*;
class Factorial {
public static void main(String args[]) {
int i, fact = 1;
System.out.println("enter the fact number");
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for (i = 1; i <= n; i++) {
fact = fact * i;
}
System.out.println("Factorial of " + n + " is: " + fact);
}
}