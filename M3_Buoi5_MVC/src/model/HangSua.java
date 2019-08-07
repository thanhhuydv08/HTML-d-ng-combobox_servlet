package model;

import java.io.Serializable;

public class HangSua  implements Serializable{
private String maHangSua,tenHangSua,diaChi,dienThoai,email;
public HangSua() {
	// TODO Auto-generated constructor stub
}
public String getMaHangSua() {
	return maHangSua;
}

public void setMaHangSua(String maHangSua) {
	this.maHangSua = maHangSua;
}

public String getTenHangSua() {
	return tenHangSua;
}

public void setTenHangSua(String tenHangSua) {
	this.tenHangSua = tenHangSua;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public String getDienThoai() {
	return dienThoai;
}

public void setDienThoai(String dienThoai) {
	this.dienThoai = dienThoai;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
