package JDBC_Day_2;
import java.sql.*;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		
		try {
			//Step1:Load driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step2:Established Connectivity or Connection
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			//Step3:Construct sql Query
			String sql=" select * from  studentdata"; 
			
			//Step4:create statement object
			 smt= con.createStatement();
			
			//Step5:Submit sql Query
			 rs=smt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				
				System.out.println("Rollno");
				System.out.println("Name");
				System.out.println("Address");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			finally
			{
				if (con !=null)
				{
					try
					{
					con.close();
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
				if (smt!=null)
				{
					try
					{
					smt.close();
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
					if (rs!=null)
					{
						try
						{
							rs.close();
						}
						catch(SQLException e)
						{
							e.printStackTrace();
						}
					}	
				}
			}
	}
