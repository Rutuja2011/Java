//Example of DeleteDemo using preparestatement.**
import java.util.*;
import java.sql.*;
public class PreUpdateDemo 
{

		public static void main(String[] args)throws Exception
		{
		   try
		   {
			   Class.forName("org.postgresql.Driver");
			   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter the number to update the record:");
		       int no=sc.nextInt();
			   PreparedStatement pst=con.prepareStatement("update Emp set ename=?,salary=? where eno=?");
			  
			   System.out.println("Enter new number:");
			   int n=sc.nextInt();
			   System.out.println("Enter new name:");
			   String nm=sc.next();
			   System.out.println("Enter the new Salary:");
			   int s=sc.nextInt();
			   pst.setInt(1,n);
			   pst.setString(2,nm);
			   pst.setInt(3,s);
			   pst.executeUpdate();
			   System.out.println("Record Updated......");
   
		   }catch(Exception e)
		   {
			   System.out.println(e);
			   
		   }
		}

	}
