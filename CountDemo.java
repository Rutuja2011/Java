//Write a java program to count the numbers of record in a table.
import java.sql.*;
import java.util.*;
public class CountDemo 
{

	public static void main(String[] args)throws Exception
	{
			   Class.forName("org.postgresql.Driver");
			   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			   Statement st=con.createStatement();
			   int cnt=0;
			   ResultSet rs=st.executeQuery("select count(*) from Emp");
			   
			   if(rs.next())
			   {
				   System.out.println("Total number of record="+rs.getInt(1));
	
			   }
			   else
			   {
				   System.out.println("Records Not found");
				   
			   }
			   rs.close();
			   st.close();
			   con.close();
		}

}
