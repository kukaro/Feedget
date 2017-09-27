package communication.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;

import model.service.FeedgetService;

@WebServlet("/market-list")
public class MarketList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MarketList() {
        super();
    }

    protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		JsonArray jsArr = FeedgetService.getInstance().findAll();
		out.println(jsArr.toString());
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
}
