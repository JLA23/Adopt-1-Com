package mainpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Item;

@WebServlet(name = "Matching", urlPatterns = { "/Matching" }, initParams = { @WebInitParam(name = "simpleParam", value = "paramValue") })
public class Matching extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		BDD bdd = new BDD();
		Item item = bdd.getRandomItem();

		out.println("<head><meta charset=UTF-8>");
		out.println("<!-- bootstrap -->");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");

		out.println("<title>Matching</title></head><body>");
		out.println("<body><div class='container'>");
		
		out.println("<div class='page-header'>" +
				"<h1>Matching</h1></div>");
		
		out.println("<form action='/Matching' method = 'post'>");
		
		out.println("<div class='row'>"
				+ "<div class=''>");
		out.println("<div class='form-group'>");
		
		out.println("<div class='panel panel-default col-md-4'>");
		out.println("<div class='panel-heading'>");
		out.println("<h3 class='panel-title'>"+item.getTitle()+"</h3>");
		out.println("</div>");
		out.println("<div class='panel-body'>");
		out.println(item.renderHTML());
		out.println("</div></div>");
		
		out.println("</div></div></div>");
		
		out.println("<div class='row'>");
		out.println("<div class='form-group col-md-1'>"
				+ "<button type='submit' class='btn btn-success btn-lg'>J'aime</button>"
				+ "</div>");
		out.println("<div class='form-group col-sm-offset-2'>"
				+ "<button type='submit' class='btn btn-danger btn-lg'>J'aime pas</button>"
				+ "</div></div>");
		
		out.println("</div></form>");

		out.close();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}