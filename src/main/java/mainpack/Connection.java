package mainpack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import mainpack.Items.Client;

import com.adopt.bdd.ClientDao;

import java.sql.*;

@WebServlet("Connection")
public class Connection extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		ClientDao dao = null;

		try{

			Init init = Init.getInstance();
			dao = init.getClientDao();

		} catch(Exception e) {
			out.println(e.getMessage());
		}

		res.setContentType("text/html");
		String email = req.getParameter("email");
		String mdp = req.getParameter("mdp");
		Client c = dao.logIn(email, mdp);

		if(c == null) {
			res.sendRedirect("login.html");
		} else {
			res.sendRedirect("ListeProfil");
		}
	}
}