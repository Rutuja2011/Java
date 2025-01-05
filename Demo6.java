//Write a program to create a new tree set, add same colors(String) and print out the treeset
import java.util.*;
public class Demo6
{

	public static void main(String[] args)
	{
		TreeSet t1=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println("Enter the colors name:");
		for(int i=0;i<n;i++)
		{
	       String s1=sc.next();
	       t1.add(s1);
	       
		}
		System.out.println("All Colors="+t1);
		}

}
