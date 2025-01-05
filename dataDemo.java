//Example of the Databasemetadata
import java.util.*;
import java.sql.*;
public class dataDemo
{

	public static void main(String[] args)throws Exception
	{
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	  DatabaseMetaData dmd=con.getMetaData();
	  System.out.println("DataBase Name="+dmd.getDatabaseProductName());
	  System.out.println("Database Product Version="+dmd.getDatabaseProductVersion());
	  
	  System.out.println("Datasse Driver Name:"+dmd.getDriverName());
	  System.out.println("Database Driver Version="+dmd.getDriverVersion());
	  System.out.println("Database User Name="+dmd.getUserName());
	  
	  ResultSet rs=dmd.getTables(null,null,null,new String[]{"TABLE"});
	  System.out.println("All Tables...");
	  while(rs.next())
	  {
	     //System.out.println(3));
	     System.out.println(rs.getString("TABLE_NAME"));
	  }
	}

}
