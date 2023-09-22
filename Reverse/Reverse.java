package Reverse;
import java.util.*;
class Reverse {
public static void main(String[] args) {
int n, rev = 0, r, a;
Scanner s = new Scanner(System.in);
System.out.println("Enter any no.: ");
n = s.nextInt();
a = n;
while (n > 0) {
r = n % 10;
rev = rev * 10 + r;
n = n / 10;
}
System.out.println("Reverse: " + rev);
}
}