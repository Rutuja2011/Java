/*Write a java program to accept 'n' integers from user & store them in an ArrayList 
  collection. Display the element of ArrayList collection in reverse order.
 */
import java.util.*;
public class Demo5
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println("Enter the n numbers:");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			a1.add(num);
		
		}
        System.out.println("All Numbers="+a1);
        Collections.reverse(a1);
        System.out.println("All Numbers in Reverse order="+a1);
	}

}
