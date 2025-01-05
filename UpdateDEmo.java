//Write a JDBC program to accept rno from user & update 1into the Database.
import java.sql.*;
import java.util.*;
public class UpdateDemo
{

	public static void main(String[] args)throws Exception 
	{
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Statement st=con.createStatement();
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Roll no to update  the record:");
		   int rno=sc.nextInt();
	       
		   System.out.println("Enter the New Name:");
		   String nm=sc.next();
		   
		   System.out.println("Enter the new Per:");
		   float p=sc.nextFloat();
		   
		   int k=st.executeUpdate("update Student set name='"+nm+"',per='"+p+"' where rno="+rno);
		   if(k>=1)
		   
			   System.out.println("Record Updated Successfully...");
		   st.close();
		   con.close();
	}

}
