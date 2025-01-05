//Write a JDBC program to accept rno from user & Delete into the Database.
import java.sql.*;
import java.util.*;
public class DeleteDemo
{

	public static void main(String[] args)throws Exception 
	{
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Statement st=con.createStatement();
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Roll no to Delete the record:");
		   int rno=sc.nextInt();
		   
		   int k=st.executeUpdate("delete from Student where rno="+rno);
		   if(k>=1)
		   
			   System.out.println("Record Deleted Successfully...");
		   st.close();
		   con.close();
	}

}
