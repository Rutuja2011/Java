/*Write a java program for the following.
create table
Alter table
Drop table
*/
import java.sql.*;
public class AlterDemo
{

	public static void main(String[] args)throws Exception
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			Statement st=con.createStatement();
			st.executeUpdate("create table book(bno int, bname varchar(10),price float)");
			System.out.println("Table Created");
			
			st.executeUpdate("alter table book drop column price");
			System.out.println("Alter Table");
			
			st.executeUpdate("drop table book");
			System.out.println("Drop table");
			
		}catch(Exception e)
		{
			
		}
	}
}
