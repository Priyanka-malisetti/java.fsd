package com.simpli;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.hibernate.*;

import com.ecommerce.EProduct;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

@WebServlet("/HibernateQueryDemo")
public class HibernateQueryDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: Get a Session (connection) from the Session Factory class
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		out.println("Hibernate Session opened.<br>");		

		// STEP 2 execute the HQL commands
// STEP 2 execute the HQL commands
		// for now we will only test if the connection is establised with MySQL server.
		List<Eproduct> eproducts = session.createQuery("from EProduct").list();
		
		out.println("<br> Data from the eproduct table<table border=1>");
		for(Eproduct prod: eproducts) {
			out.println("<tr><td>" + prod.getID() + "<td>" + prod.getName() + "<td>" +  
		 prod.getPrice() + "<td>" +  prod.getDateAdded() );
		}
		
		
		session.forceClose();

		out.println("Hibernate Session closed.<br>");

		out.println("</body></html>");
	}

}