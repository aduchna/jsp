package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public FirstServlet() {
        super();
        
    }
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().println("Hello World");
				
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		response.getWriter().println("Hello " + firstName + lastName + "!");
	}
		
		/*HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (firstName!=null && !firstName.equals(""))
		{
			session.setAttribute("name", firstName);
			context.setAttribute("name", firstName);
		}
		
		
		//http://localhost:8080/servletjspdemo/FirstServlet?name=Artur
				
		response.getWriter().println("Hello " + firstName + lastName + "!");
		response.getWriter().println("Hello from session " + session.getAttribute("name") + "!");	
		response.getWriter().println("Hello from context " + context.getAttribute("name") + "!");	}
		*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
