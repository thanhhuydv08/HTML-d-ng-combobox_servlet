package model;

import java.io.Serializable;

public class LoaiSua implements Serializable {
private String maLoai, tenLoai;
public LoaiSua() {
	// TODO Auto-generated constructor stub
}
public String getMaLoai() {
	return maLoai;
}

public void setMaLoai(String maLoai) {
	this.maLoai = maLoai;
}

public String getTenLoai() {
	return tenLoai;
}

public void setTenLoai(String tenLoai) {
	this.tenLoai = tenLoai;
}

}
