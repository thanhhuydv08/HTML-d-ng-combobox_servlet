package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoaiSuaBL {
	 ArrayList<LoaiSua> lsls ;
	 Connection connection;
	 Statement statement;
	 ResultSet resultSet;
	public ArrayList<LoaiSua> DocTatCa(){
		
		 connection = new CSDL().ReadDatabase("qlbansua");
		 String sql ="select * from loai_sua";
		 try {
			 lsls = new ArrayList<>();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
		    LoaiSua loaiSua = new LoaiSua();
		     loaiSua.setMaLoai(resultSet.getString("Ma_loai_sua"));
		     loaiSua.setTenLoai(resultSet.getString("Ten_loai"));
			   lsls.add(loaiSua);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lsls;
	}
}
