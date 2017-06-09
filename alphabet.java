import java.io.*;
import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		char a=scan.next().charAt(0);
		if(a>'a'&&'z'>a)
		System.out.println("it is an alphabet");
		else
		System.out.println("it is not an alphabet");
	}
}
