package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CSDL {
	Connection connection;
	public  Connection ReadDatabase(String databaseName) {
			String url ="jdbc:mysql://localhost:3306/"+databaseName+"?useUnicode=true&characterEncoding=UTF-8";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				try {
					connection = DriverManager.getConnection(url,"root","");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Statement statement = (Statement) connection.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//	String sql="Select * from informationperson";
//			ResultSet resultSet = statement.executeQuery(sql);// tra ve list cua table
	   //	statement.executeUpdate(sql); // tra ve 1 neu ghi duoc vao table, khi nao thuc hien  excuquery  tra ve list khi lay data ve select * , con exuupdate thu hien lech inseet. delete, udate
//			resultSet.next(); // lap de lay value tung cot trong table data
			return connection;
	 }
}
