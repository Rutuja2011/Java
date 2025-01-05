/*Write a java program to accept names of 'n' cities insert into the same into array list
 * collection  & display the contents of same array lost. also removes all these elements
 * 
 */
import java.util.*;
public class Demo3 
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		System.out.println("Enter the n city Names:");
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			a1.add(s1);
			
		}
		System.out.println("All Cities="+a1);
		a1.removeAll(a1);
		System.out.println("All cities="+a1);
	}

}
