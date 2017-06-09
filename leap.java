import java.io.*;
import java.util.*;
class leap
{
	public static void main(String args[])
	{
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%4==0)
		{
		System.out.println("it is a leap year");
		}
		else
		{
		System.out.println("it is not a leap year");
		}
	}
}
