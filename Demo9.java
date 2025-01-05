//Example of Iterator
import java.util.*;
public class Demo9
{

	public static void main(String[] args)
	{
	  ArrayList a1=new ArrayList();
	  a1.add("JAVA");
	  a1.add("C");
	  a1.add("CPP");
	  a1.add("PYTHON");
	
	  Iterator it=a1.iterator();
	  while(it.hasNext())
	  {
		  System.out.println("Element ="+it.next());
	  }
	}

}
