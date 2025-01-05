import java.sql.*;
public class InsertDemo
{

	public static void main(String[] args)throws Exception
	{
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	   Statement st=con.createStatement();
	   int k=st.executeUpdate("insert into Student values(1,'rutu',99)");
	   if(k>=1)
	   
		   System.out.println("Record Inserted Successfully...");
	   st.close();
	   con.close();
	}

}
