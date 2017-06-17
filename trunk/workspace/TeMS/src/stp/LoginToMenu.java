package stp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sql.SQLCommand;

@WebServlet ("/stp/LoginToMenu")
public class LoginToMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("サーブレット");
		String sql = SQLCommand.outputMonth;
		System.out.println(sql + " を実行しました");
		getServletConfig().getServletContext().
		getRequestDispatcher("/jsp/menu.jsp" ).
		forward( request, response );
	}

}
