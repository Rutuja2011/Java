/* Write a java program to accept the details of teacher(Tid ,Tname, Tsubject) store 
 * it into database & display*/
import java.sql.*;
import java.util.*;
public class DispDemo1 
{

	public static void main(String[] args)throws Exception
	{
		 Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Scanner sc=new Scanner(System.in);
           Statement st=con.createStatement();
           st.executeUpdate("insert into Teacher values(101,'ritu','java')");
           System.out.println("Record Inserted....");
           ResultSet rs=st.executeQuery("select * from Teacher");
           System.out.println("Teacher id \t Teacher Name \t Tsubject");
           System.out.println("---------------------------------------");
           while(rs.next())
           {
        	   System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+  " \t\t"+rs.getString(3));
           }
           rs.close();
           st.close();
           con.close();
           }

}
