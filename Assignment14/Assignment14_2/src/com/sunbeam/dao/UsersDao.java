package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UsersDao implements AutoCloseable{
	private Connection con;
	
	public UsersDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		if(con != null)
			con.close();
	}
	
	public Date parseDate(String str) {
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(str);
		return date;
		}
		catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public int addUser(Users user) throws SQLException{
		String sql = "INSERT INTO users VALUES (default,?,?,?,?,?,false,'voter')";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			java.util.Date uDate=user.getDate();
			java.sql.Date sDate=new java.sql.Date(uDate.getTime());
			stmt.setDate(5, sDate);
//			stmt.setInt(6, user.getStatus());
//			stmt.setString(7, user.getRole());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public List<Users> findAll() throws SQLException {
		List<Users>list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
				Users user=new Users();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));

				java.sql.Date sdate=rs.getDate("dob");
				java.util.Date udate= new java.sql.Date(sdate.getTime()) ;
				user.setDate(udate);
				
				user.setStatus(rs.getInt("status"));
				user.setRole(rs.getString("role"));
				list.add(user);	
				}
			}
		}
		return list;
	}
	
	public int updateUser(Users user)throws SQLException{
		String sql = "UPDATE users SET first_name =?, last_name=?, email=?, password=?, dob=?, status=?, role=? where id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			
			java.util.Date uDate=user.getDate();
			java.sql.Date sDate=new java.sql.Date(uDate.getTime());
			stmt.setDate(5, sDate);
			stmt.setInt(6, user.getStatus());
			stmt.setString(7, user.getRole());
			stmt.setInt(8, user.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
		
	}
	
	public int deleteCandidate(int id) throws SQLException {
		int cnt;
		String sql="delete from users where id=?";
		try( PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setInt(1,id);
			 cnt=stmt.executeUpdate();
		}
		return cnt;
		
	}
	
	
}
