import java.io.*;
import java.util.*;
public class Demo8 
{

	public static void main(String[] args)
	{
	   LinkedList l1=new LinkedList();
	   l1.add("red");
	   l1.add("blue");
	   l1.add("yellow");
	   l1.add("orange");
	   System.out.println(l1);
	   
	   LinkedList l2=new LinkedList();
	   l2.add("pink");
	   l2.add("green");
	   System.out.println(l2);
	   
	   l1.add(2,l2);
	   System.out.println("New LinkedList="+l1);
	   }

}
