import java.util.Scanner;
public class Student
{
String usn,name,branch;
long phone;
void insertStudent(String reg,String nm, String br,long ph)
{
usn=reg;
name=nm;
branch=br;
phone=ph;
}
void displayStudent()
{
System.out.println("**********************");
System.out.println("USN= "+usn);
System.out.println("NAME= "+name);
System.out.println("BRANCH= "+branch);
System.out.println("PHONE NUMBER= "+phone);
System.out.println("**********************");
}
public static void main(String args[])
{
Student st[]=new Student [100];
Scanner ip=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=ip.nextInt();
for(int i=0;i<n;i++)
st[i]=new Student();
for(int j=0;j<n;j++)
{

System.out.println("Enter the Usn,Name,Branch,Phone Number");
String usn=ip.next();
String name=ip.next();
String branch=ip.next();
long phone=ip.nextLong();
st[j].insertStudent(usn,name,branch,phone);
}
for( int m=0;m<n;m++)
{
System.out.format("Student %d details are\n",m+1);
st[m].displayStudent();
}
}
}