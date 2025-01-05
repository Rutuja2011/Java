//Write a JDBC program to accept rno, name, per from user & insert into the Database.
import java.sql.*;
import java.util.*;
public class UserInsertDemo
{

	public static void main(String[] args)throws Exception 
	{
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Statement st=con.createStatement();
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Roll no:");
		   int rno=sc.nextInt();
		   
		   System.out.println("Enter the Name:");
		   String name=sc.next();
		   
		   System.out.println("Enter the per:");
		   float per=sc.nextFloat();
		   
		   int k=st.executeUpdate("insert into Student values("+rno+",'"+name+"',"+per+")");
		   if(k>=1)
		   
			   System.out.println("Record Inserted Successfully...");
		   st.close();
		   con.close();
	}

}
