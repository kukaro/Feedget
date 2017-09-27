package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.service.DeveloperService;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("Insert Action : " + action);
		switch (action) {
		case "join":
			join(request, response);
			break;
		default:

		}
	}

	private void join(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("devName");
		String email = request.getParameter("devEmail");
		String password = request.getParameter("devPassword");
		String passwordVerify = request.getParameter("devPasswordVerify");
		String company = request.getParameter("devCompany");
		String site = request.getParameter("devSite");
		String category = request.getParameter("devCategory");
		boolean emailIsUnique = DeveloperService.getInstance().emailIsUnique(email);
		if (!password.equals(passwordVerify)) {
			System.out.println("Controller - join : password was not mathced");
			response.sendRedirect("/Feedget/index");
		}
		else if(!emailIsUnique) {
			System.out.println("Controller - join : email is not unique");
			response.sendRedirect("/Feedget/index");
		}
		else {
			HttpSession sess = request.getSession(true);
			sess.setAttribute("loginEmail", email);
			sess.setAttribute("loginSite", site);
			sess.setAttribute("loginCompany", company);
			sess.setAttribute("loginName", name);
			sess.setAttribute("isLogin", true);
			DeveloperService.getInstance().registDeveloper(name, email, password, company, site, category);
			response.sendRedirect("/Feedget/index");
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
