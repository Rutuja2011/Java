//Example of PrepareStatement
import java.sql.*;
import java.util.*;
public class insert5preDemo 
{

	public static void main(String[] args)throws Exception
	{
	   try
	   {
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Scanner sc=new Scanner(System.in);
		   PreparedStatement pst=con.prepareStatement("insert into Emp values(?,?,?)");
		   for(int i=1;i<=5;i++)
		   {
			   System.out.println("Enter emp no=");
			   int eno=sc.nextInt();
			   
			   System.out.println("Enter Emp name=");
			   String nm=sc.next();
			   
			   System.out.println("Enter Emp Salary=");
			   float sal=sc.nextFloat();
			   
		       pst.setInt(1,eno);
		       pst.setString(2,nm);
		       pst.setFloat(3, sal);
		   
		       pst.executeUpdate();
		       System.out.println("Record Inserted......");  
		   }
		   
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
}

