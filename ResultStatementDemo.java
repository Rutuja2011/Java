//Write a java program to display the columnname,columnDatatype, columnsize and number of columns(using the resultsetmetadata).
import java.sql.*;
import java.io.*;
public class Resultsetmetadata1
{

	public static void main(String[] args)throws Exception
	{
		  Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Statement st=con.createStatement();
		   ResultSet rs=st.executeQuery("Select * from Emp");
		    ResultSetMetaData rsm=rs.getMetaData();
		   int cols=rsm.getColumnCount();
		   System.out.println("Number of cols="+cols);
		   for(int i=1;i<=cols;i++)
		   {
			   System.out.println("Column Name="+rsm.getColumnName(i));
			   System.out.println("Column DataType="+rsm.getColumnTypeName(i));
			   System.out.println("Size="+rsm.getColumnDisplaySize(i));
		   }
		   rs.close();
		   st.close();
		   con.close();
  

	}

}
