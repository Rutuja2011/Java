/* Write a java program to display the last & second last record using 
 * scrollable and upadatable ResultSet
 * 
 */
import java.sql.*;
import java.util.*;
import java.io.*;
public class ScrollDemo
{

	public static void main(String[] args)throws Exception
	{
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	       Scanner sc=new Scanner(System.in);
	       
	       Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	       ResultSet rs=st.executeQuery("select * from Emp");
	       rs.last();
	       System.out.println("Last Emp no="+rs.getInt(1));
	       System.out.println("Last Emp Name="+rs.getString(2));
	       System.out.println("Last Emp Salary="+rs.getFloat(3));
	       
	       rs.previous();
	       System.out.println("Second last Emp no="+rs.getInt(1));
	       System.out.println(" Second Last Emp Name="+rs.getString(2));
	       System.out.println(" Second Last Emp Salary="+rs.getFloat(3));
	       
	       
	}

}
