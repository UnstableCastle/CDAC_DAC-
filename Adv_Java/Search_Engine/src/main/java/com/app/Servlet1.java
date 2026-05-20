package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("txtData");
		String engine = request.getParameter("engine");
		
		try {
			// 1. Guard clause: Ensure data and engine are actually provided
			if (data == null || engine == null || data.trim().isEmpty()) {
				response.setContentType("text/html");
				response.getWriter().println("<h3>Please provide both a search query and an engine.</h3>");
				return;
			}

			// 2. URL Encode the user input so spaces/special characters don't break the URL
			String encodedData = URLEncoder.encode(data, StandardCharsets.UTF_8);
			String url = "";

			// 3. Safe string comparison (Yoda conditions) to prevent NullPointerExceptions
			if ("google".equals(engine)) {
				url = "https://www.google.com/search?q=" + encodedData;
			} else if ("yahoo".equals(engine)) {
				url = "https://in.search.yahoo.com/search?p=" + encodedData;
			} else if ("bing".equals(engine)) {
				url = "https://www.bing.com/search?q=" + encodedData;
			} else {
				// Handle case where engine doesn't match known options
				response.setContentType("text/html");
				response.getWriter().println("<h3>Unknown search engine selected.</h3>");
				return;
			}

			// 4. Send the redirect
			response.sendRedirect(url);

		} catch (Exception e) {
			// Avoid setting content type twice if possible, handling cleanly here
			response.setContentType("text/html");
			response.getWriter().println("Error occurred: " + e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}