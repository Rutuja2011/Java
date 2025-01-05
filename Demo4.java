/*Write a java program to read 'n' names of your friends, store it into linked list also 
display content of the same*/
import java.util.*;
public class Demo4 
{

	public static void main(String[] args) 
	{
		LinkedList a1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
	    System.out.println("Enter n name:");
	    for(int i=0;i<n;i++)
	    {
	    	String s1=sc.next();
	    	a1.add(s1);
	    }
	    System.out.println("All Friends=="+a1);
	}

}
