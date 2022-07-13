import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException{
		//read values from request
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//get PrintWriter object for writing response
		PrintWriter out = response.getWriter();
		
		if(username!=null && username.equals("revati")) {
			if(password!=null && password.equals("12345")) {
				out.print("Login Successful");
			}else {
				out.print("Invalid Password...! Try Again..");
			}
		}else {
			out.print("Invalid Username...! Try Again..");
		}
	}
}

