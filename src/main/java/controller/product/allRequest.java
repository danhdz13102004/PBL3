package controller.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SachDao;
import model.NhaXuatBan;
import model.Sach;
import model.TacGia;
@WebServlet(urlPatterns = "/product/*")
public class allRequest extends HttpServlet {
	SachDao sachDao = SachDao.getSachDao();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		try {
			url = request.getRequestURL().toString();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(url);
		if(url.contains("/detail")) {
			showInfor(request, response);
		}
		RequestDispatcher rq = getServletContext().getRequestDispatcher("/productDetail.jsp");
		rq.forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	protected void showInfor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Sach sach = new Sach();
		sach.setId(id);
		sach = sachDao.selectById(sach);
		System.out.println(sach);
		request.setAttribute("product", sach);
	}
}

