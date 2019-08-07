package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HangSua;
import model.HangSuaBL;
import model.LoaiSua;
import model.LoaiSuaBL;
import model.Sua;
import model.SuaBL;
import sun.font.LayoutPathImpl;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({ "/TimSuaTheoLoaiHangTenServlet", "/Tim_kiem_sua.html" })
public class TimSuaTheoLoaiHangTenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TimSuaTheoLoaiHangTenServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String maLoai, maHang, tenSua;
        
        maLoai=request.getParameter("cboLoai");
        maHang = request.getParameter("cboHang");
        tenSua = request.getParameter("txtTenSuaTim");
        
        ArrayList<LoaiSua> dsls =  new LoaiSuaBL().DocTatCa();
        ArrayList<HangSua> dshs = new HangSuaBL().DocTatCa();
        ArrayList<Sua> dsSua = new SuaBL().DocTheoHangLoaiTen(maHang, maLoai, tenSua);
        HangSua hangSua = new HangSuaBL().DocTheoMaHang(maHang);
        request.setAttribute("dsls", dsls);
        request.setAttribute("dshs", dshs);
        request.setAttribute("dsSua", dsSua);
        request.setAttribute("soSP", dsSua.size());
        request.setAttribute("hangSua", hangSua);
        request.getRequestDispatcher("Tim_kiem_sua.jsp").forward(request, response);
	}

}