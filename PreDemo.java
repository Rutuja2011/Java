//Example of PrepareStatement
import java.sql.*;
public class PreDemo
{

	public static void main(String[] args)throws Exception
	{
	   try
	   {
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		  // Statement st=con.createStatement();
		   
		   PreparedStatement pst=con.prepareStatement("insert into Emp values(?,?,?)");
		   pst.setInt(1,10);
		   pst.setString(2,"Dhanu");
		   pst.setFloat(3, 99999);
		   
		   pst.executeUpdate();
		   System.out.println("Record Inserted......");
		   
		   
		   
	   }catch(Exception e)
	   {
		   System.out.println(e);
		   
	   }
	}

}
