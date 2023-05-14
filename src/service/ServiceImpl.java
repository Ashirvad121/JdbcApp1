package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import Utility.getConnection;

public class ServiceImpl {
	public String registerStudent(int roll,String name,int marks) {
//		System.out.println("***");
		String message="not inserted";
		try(Connection conn=getConnection.establishConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2,name);
			ps.setInt(3, marks);
//			System.out.println("***");
			int x=ps.executeUpdate();
//			System.out.println(x);
			if(x>0) {
				message=x+" record inserted successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}
	public String updateMarks(int id,int marks) {
		String message="not able to update";
		try(Connection conn=getConnection.establishConnection()){
			PreparedStatement ps=conn.prepareStatement("update student set marks=? where roll=?");
			ps.setInt(1, marks);
			ps.setInt(2, id);
			int x=ps.executeUpdate();
			if(x>0) {
				message="update successfully";
			}
		}catch(Exception e) {
			e.getMessage();
		}
		return message;
	}
	public String deleteStudent(int roll) {
		String message="not deleted";
		try(Connection conn=getConnection.establishConnection()){
			PreparedStatement ps= conn.prepareStatement("delete from student where roll=?");
			ps.setInt(1, roll);
			int x= ps.executeUpdate();
			if(x>0) {
				message="deleted successfully";
			}
		}catch(Exception e) {
			e.getMessage();
		}
		return message;
	}
	public static void viewStudentByRoll(int roll) {
		
		try(Connection conn=getConnection.establishConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from student where roll =?");
			ps.setInt(1, roll);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int r=rs.getInt("roll");
				String name=rs.getString("name");
				int m=rs.getInt("marks");
				System.out.println("roll "+r);
				System.out.println("name "+name);
				System.out.println("marks "+m);
			}else {
				System.out.println("roll not exist");
			}
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	public void viewAllStudents() {
		try(Connection conn=getConnection.establishConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int r=rs.getInt("roll");
				String n=rs.getString("name");
				int m=rs.getInt("marks");
				System.out.println("roll "+r);
				System.out.println("name "+n);
				System.out.println("marks "+m);
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
