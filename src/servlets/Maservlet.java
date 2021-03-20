package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.Math;
/**
 * Servlet implementation class Maservlet
 */
@WebServlet("/Maservlet")
public class Maservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Maservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		int a=Integer.parseInt(request.getParameter("v1"));
		//String x=request.getParameter("v1"); int a=IntegerparseInt(x)
		int b=Integer.parseInt(request.getParameter("v2"));
		Math m=new Math(a, b);
		PrintWriter out=response.getWriter();
		out.print(m.toString());
		
		
		//envoie par dispatcher
request.setAttribute("resultat", m.toString()); //affecte la méthode toString() à une variable resultat
request.getRequestDispatcher("affiche.jsp").forward(request, response);
	}

}
