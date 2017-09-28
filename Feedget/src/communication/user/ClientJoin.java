package communication.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.UserService;

public class ClientJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientJoin() {
		super();
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		if (UserService.getInstance().join(email, password, name)) {
			out.println("{'state':'true'}");
		}
		else {
			out.println("{'state':'false'}");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
