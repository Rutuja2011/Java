/* Write a java program to create at least 5 tables in a database. Add a column(Field)in a given 
 * Table.Drop given table from the database
 */
import java.util.*;
import java.sql.*;
public class TableDemo
{

  public static void main(String[] args)throws Exception
  {
     try
   	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	    Statement st=con.createStatement();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Table Name:");
	    String tn=sc.next();
	    System.out.println("Enter new Column name:");
	    String cn=sc.next();
	    System.out.println("Enter the DataType:");
	    String dt=sc.next();
	    
	    st.executeUpdate("alter table "+tn+" add column "+cn+" "+dt+"");
	    System.out.println("Column Added...");
	    System.out.println("Enter the Table Name to Drop");
	    String dp=sc.next();
	    st.executeUpdate("drop table "+tn+"");
	    System.out.println("Table Drop Successfully....");
	}catch(Exception e)
	{
		System.out.println(e);
	}
   }
}
