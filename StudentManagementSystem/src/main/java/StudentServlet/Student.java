package StudentServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import JDBCconnection.Records;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String SName = request.getParameter("sname");
		String SPassword = request.getParameter("spass");
		
		try {
			Records r = new Records();
			
			boolean login = r.checkLogin(SName, SPassword);
			
			if(login) {
				request.setAttribute("SName", SName);
				request.setAttribute("SPassword", SPassword);
				
				request.getRequestDispatcher("Files/success.jsp").forward(request, response);
			} else {
				response.sendRedirect("Files/Login.html");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
		
		System.out.println(SName);
		System.out.println(SPassword);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
