package edu.ifrs;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
@WebServlet("/Servlet")
public class MyServlet extends HttpServlet{
	int valor1=0, valor2=0;
	String operacao = "";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**@EJB
	private CalcBean bean;
	*/
	
	public MyServlet() {
		super();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InitialContext context;
		CalcBean bean=null;
		try {
			context = new InitialContext();
			bean = (CalcBean)context.lookup("java:global/Calculator/CalcBean!edu.ifrs.CalcBean");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		valor1 = Integer.parseInt(request.getParameter("valor1"));
	     valor2 = Integer.parseInt(request.getParameter("valor2"));
	     operacao = request.getParameter("operacao");
	     response.getWriter().append("Resultado: " + bean.calculate(valor1, valor2, operacao)).append(request.getContextPath());
	}
	
}
