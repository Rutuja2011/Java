import java.util.*;
public class Demo1 
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Java");
		a1.add("100");
		a1.add("xml");
		a1.add("10.33");
		System.out.println(a1);
		a1.add(2,"joomla");
		System.out.println(a1);
		/*a1.remove("xml");
		System.out.println(a1);
		a1.clear();
		a1.removeAll(a1);
		System.out.println(a1);*/
		
		if(a1.contains("xml"))
			System.out.println("xml object Found ");
		else
			System.out.println("Xml object not Found");
		
		System.out.println("No of elements="+a1.size());
		
		System.out.println("Second position element="+a1.get(2));
		
		if(a1.isEmpty())
			System.out.println("ArrayList is empty");
		else
			System.out.println("Arraylist is not Empty");
		
		ArrayList a2=new ArrayList();
		a2.add("DEBMS");
		a2.add("RDBMS");
		a2.add("Oracle");
		a2.add("VScode");
		System.out.println(a2);
		//a1.addAll(a2);
		a1.addAll(2,a2);
		if(a1.containsAll(a2))
			System.out.println("a2 collection found in a1");
	}

}
