package communication.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;

import model.service.FeedgetService;
import model.service.UserService;

public class ClientLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientLogin() {
		super();
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if (UserService.getInstance().login(email, password) != null) {
			String result = "{'emailCheck':'true'}";
			out.println(result);
		} else {
			out.println("{'emailCheck':'false'}");
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
