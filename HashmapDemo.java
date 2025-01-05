import java.util.*;
public class HashmapDemo
{

	public static void main(String[] args)
	{
	    HashMap hm=new HashMap();
	    hm.put("rno","101");
	    hm.put("name","om");
	    hm.put("per","99.22");
	    hm.put("add","shrirampur");
	    hm.put("name", "sai");
	    HashMap hm1=new HashMap(hm);
	    hm1.put("mh", "Maharashtra");
	    System.out.println(hm1);
	    hm1.clear();
	    hm.remove("rno");
	    System.out.println(hm);
	    
	    System.out.println("Value"+hm.get("per"));
	    if(hm.containsValue("om"))
	    	System.out.println("Om value is found");
	    else
	    	System.out.println("Om value is not found");
	    
	    System.out.println("Number of elements="+hm.size());
	    if(hm.isEmpty())
	       System.out.println("Map is Empty");
	    else
	    	System.out.println("Map is not Empty");
	    
	}

}
