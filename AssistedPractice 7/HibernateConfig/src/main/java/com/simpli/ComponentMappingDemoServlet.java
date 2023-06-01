package com.simpli;

import java.io.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.ServerException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ecommerce.*;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

@WebServlet("/component-mapping-demo")
public class ComponentMappingDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpRequest request, HttpResponse response)
			throws ServerException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		// STEP 2 execute the HQL commands
		// for now we will only test if the connection is establised with MySQL server.
		List<Eproduct> eproducts = session.createQuery("from EProduct").list();
out.println("<br> Data from the eproduct table<table border=1><th>ID<th>NAME<th>PRICE<th>DATE_ADDED<th>PARTS");
		for (Eproduct prod : eproducts) {
			out.println("<tr><td>" + prod.getID() + "<td>" + prod.getName() + "<td>" + prod.getPrice() + "<td>"
					+ prod.getDateAdded());

			// Component class info (Product parts)
ProductParts parts = prod.getParts();
			
			out.println("<td>" + parts.getCpu() + ", " + parts.getHdd() + ", " + parts.getRam());

		}

		session.forceClose();

		out.println("</body></html>");
	}

}