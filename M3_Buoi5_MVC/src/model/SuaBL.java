package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;



public class SuaBL {
	 Connection connection;
	PreparedStatement preparedStatement;
	 ResultSet resultSet;
	ArrayList<Sua> lss;
public SuaBL() {
	// TODO Auto-generated constructor stub
}
public ArrayList<Sua> DocTheoHangLoaiTen(String maHang, String maLoai, String tenSua){
	
	connection = new CSDL().ReadDatabase("qlbansua");
	// String sql ="select * from sua ";
	 lss = new ArrayList<>();
		try {
		
			 PreparedStatement preparedStatement = connection.prepareStatement("select * from sua where ma_loai_sua = ? and ma_hang_sua=? and ten_sua like ?");
			 preparedStatement.setString(1,maLoai);
			 preparedStatement.setString(2,maHang);
			 preparedStatement.setString(3,"%"+tenSua+"%");
	       resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				Sua sua = new Sua();
				sua.setMaSua(resultSet.getString("ma_sua"));
				sua.setTenSua(resultSet.getString("ten_sua"));
				sua.setMaLoaiSua(resultSet.getString("ma_loai_sua"));
				sua.setMaHangSua(resultSet.getString("ma_hang_sua"));
				sua.setTrongLuong(resultSet.getString("trong_luong"));
				sua.setDonGia(resultSet.getString("don_gia"));
				sua.setDinhDuong(resultSet.getString("tp_dinh_duong"));
				sua.setLoiIch(resultSet.getString("loi_ich"));
				sua.setHinh(resultSet.getString("hinh"));

				lss.add(sua);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return lss;
}
}
