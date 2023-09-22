package fibonacci;
import java.util.*;
public class Fibonacci {

	public static void main(String args[]){
		int n1=0,n2=1,n3,i,count=0;
		System.out.println("enter the no of count");
		Scanner in=new Scanner (System.in);
		count=in.nextInt();
		System.out.print(n1+" "+n2); //printing 0 and 1
		for(i=2;i< count;++i){
		n3=n1+n2;
		System.out.print(" "+n3); //loop starts from 2 because 0 and 1 are already printed
		n1=n2;
		n2=n3;
		}
	}
}	

