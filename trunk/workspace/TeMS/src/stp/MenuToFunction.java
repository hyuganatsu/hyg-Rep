package stp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/stp/MenuToFunction")
public class MenuToFunction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("メニュー画面から機能画面への遷移処理");
		getServletConfig().getServletContext().
		getRequestDispatcher("/jsp/function.jsp" ).
		forward( request, response );
	}

}
