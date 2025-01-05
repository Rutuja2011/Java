//Accept Emp no from user and search the record if the record found then display the record otherwise display message record not found
import java.util.*;
import java.sql.*;
public class SearchDemo
{

	public static void main(String[] args)throws Exception
    {
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	   Statement st=con.createStatement();
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the eno to search the record|:");
	   int num=sc.nextInt();
	   
	   ResultSet rs=st.executeQuery("select * from Emp where eno="+num);
	   
	   if(rs.next())
	   {
		   System.out.println("Emp Name="+rs.getString(2));
		   System.out.println("Emp Salary="+rs.getFloat(3));
		   
	   }
	   else
	   {
		   System.out.println("Record Not found");
		   
	   }
	   rs.close();
	   st.close();
	   con.close();
	}

}
