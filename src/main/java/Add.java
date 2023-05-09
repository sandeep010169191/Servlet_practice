import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("first"));
		int num2 = Integer.parseInt(request.getParameter("second"));
		
		int sum = num1 + num2;
		
		out.print("Sum of "+num1+" and "+num2+" is: "+sum);
	}

}
