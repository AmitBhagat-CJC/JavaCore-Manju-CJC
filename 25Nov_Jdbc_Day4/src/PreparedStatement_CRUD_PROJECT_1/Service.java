package PreparedStatement_CRUD_PROJECT_1;

import java.util.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Service implements I 
{
	//Implements all methods Here.
	
		public void addData() throws Exception
		{ 
			Connection con=MyConnection.getConnection();
			String sql=" insert into employee values (?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, 20);
			ps.setString(2, "Shankar");
			ps.setDouble(3, 500);
			ps.setLong(4, 52425362);
			ps.execute();
			System.out.println(" Sucessfully Inserted");
		}
		@Override
		public void retriveData() throws Exception 
		{
			Connection con=MyConnection.getConnection();
			String sql1="SELECT * FROM employee";
			PreparedStatement ps1= con.prepareStatement(sql1);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println(rs.getDouble(4));
				ps1.execute();
			}
			
			System.out.println(" Sucessfully Retrieved");
		}
		@Override
		public void deleteData() throws Exception 
		{
			Connection con=MyConnection.getConnection();
			String sql2="DELETE FROM employee WHERE (Eid=?)";
			PreparedStatement ps2= con.prepareStatement(sql2);
			ps2.setInt(1, 20);
			ps2.execute();
			System.out.println("Sucessfully Deleted");
		}
		@Override
		public void updateData() throws Exception 
		{
			Connection con=MyConnection.getConnection();
			String sql3="UPDATE employee SET EName=?, EMob=?,ESalary=?WHERE Eid=?";
			PreparedStatement ps3= con.prepareStatement(sql3);
			ps3.setString(1, "vishal");
			ps3.setLong(2, 852369);
			ps3.setDouble(3, 25412);
			ps3.setInt(4, 1);
			ps3.execute();
			System.out.println("Sucessfully Updated");
		}
}
	
	
	

