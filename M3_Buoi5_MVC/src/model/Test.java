package model;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<LoaiSua> ls = new LoaiSuaBL().DocTatCa();
System.out.println(ls.size());
	}

}
