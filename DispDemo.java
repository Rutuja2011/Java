import java.sql.*;
public class DispDemo
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("Select * from Student");
	    while(rs.next())
	    {
	    	System.out.println("Student Roll No:"+rs.getInt(1));
	    	System.out.println("Student Name:"+rs.getString(2));
	    	System.out.println("Student Per:"+rs.getInt(3));
	    	
	    }
	    rs.close();
	    st.close();
	    con.close();
		

	}

}
