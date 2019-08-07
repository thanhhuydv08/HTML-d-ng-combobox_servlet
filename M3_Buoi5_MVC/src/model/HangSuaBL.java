package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HangSuaBL {
 	ArrayList<HangSua> lshs;
 	HangSua hangSua;
 Connection connection;
 Statement statement;
 ResultSet resultSet;
public HangSuaBL() {
	// TODO Auto-generated constructor stub
}
public ArrayList<HangSua> DocTatCa(){
	
	connection = new CSDL().ReadDatabase("qlbansua");
	 String sql ="select * from hang_sua";
		 lshs = new ArrayList<>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				HangSua hangSua = new HangSua();
				hangSua.setMaHangSua(resultSet.getString("Ma_hang_sua"));
				hangSua.setTenHangSua(resultSet.getString("Ten_hang_sua"));
				hangSua.setDienThoai(resultSet.getString("Dien_thoai"));
				hangSua.setDiaChi(resultSet.getString("Dia_chi"));
				hangSua.setEmail(resultSet.getString("Email"));
				lshs.add(hangSua);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return lshs;
}
public HangSua DocTheoMaHang(String maHang) {
	connection = new CSDL().ReadDatabase("qlbansua");
	 String sql ="select * from hang_sua where Ma_hang_sua='"+maHang+"'";
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				hangSua = new HangSua();
				hangSua.setMaHangSua(resultSet.getString("Ma_hang_sua"));
				hangSua.setTenHangSua(resultSet.getString("Ten_hang_sua"));
				hangSua.setDienThoai(resultSet.getString("Dien_thoai"));
				hangSua.setDiaChi(resultSet.getString("Dia_chi"));
				hangSua.setEmail(resultSet.getString("Email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return hangSua;
}
}
