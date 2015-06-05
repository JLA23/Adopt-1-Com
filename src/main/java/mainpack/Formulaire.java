package mainpack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("Formulaire")
public class Formulaire extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		int error = Integer.parseInt(req.getParameter("error"));
		//out.println("<html><head><meta charset=UTF-8>");
		out.println("<link rel=stylesheet type=text/css href=style.css>");
		out.println("<title>Formulaire</title></head>");
		out.println("<body><center>");
		out.println("<h1>Formulaire Inscription</h1>" );
		if (error == 1){
			out.println("Veuillez remplir les champs avec ( * )");
		}
		out.println("<table cellpadding=10>");
		out.print("<FORM METHOD='POST' ACTION='VerifForm'>");
		out.println("<TR><TD>Nom (*) : <TD><INPUT type='text' value='' name='nom'></TD></TR>");
		out.println("<TR><TD>Prénom (*) :<TD> <INPUT type='text' value='' name='prenom'></TD></TR>");
		out.println("<TR><TD>Entreprise (*) : <TD><INPUT type='text' value='' name='entreprise'></TD></TR>");
		out.println("<TR><TD>Adresse (*) : <TD><INPUT type='text' value='' name='adresse'></TD></TR>");
		out.println("<TR><TD>Téléphone (*) : <TD><INPUT type='text' value='' name='tel'></TD></TR>");
		out.println("<TR><TD>E-mail (*) : <TD><INPUT type='text' value='' name='mail'></TD></TR>");
		out.println("<TR><TD>Fax : <TD><INPUT type='text' value='' name='fax'></TD></TR>");
		out.println("<TR><TD>Profession (*) : <TD><INPUT type='text' value='' name='profession'></TD></TR>");
		out.println("<TR><TD>Description : <TD><INPUT type='text' value='' name='description'></TD></TR>");
		out.println("<TR><TD>Facebook : <TD><INPUT type='text' value='' name='facebook'></TD></TR>");
		out.println("<TR><TD>Twitter : <TD><INPUT type='text' value='' name='twitter'></TD></TR>");
		out.println("<TR><TD>LinkedIn : <TD><INPUT type='text' value='' name='linkedin'></TD></TR>");

		out.println("<TR><TD><TD><INPUT type='submit' value='Valider'></FORM></TD></TR></table></center></body><br><br>");
	}
	

}
