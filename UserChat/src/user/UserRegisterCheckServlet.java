package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegisterCheckServlet")
public class UserRegisterCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("texml/html;charset=UTF-8");
		String userID = request.getParameter("userID");
		if(userID==null || userID.equals("")) response.getWriter().write("-1");
		//문자열 형태로 출력하기 위해 공백 문자열 추가
		response.getWriter().write(new UserDAO().registerCheck(userID) + "");
	}

}
