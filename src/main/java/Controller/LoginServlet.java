package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAO;
import Model.JavaBeans;


@WebServlet(urlPatterns = { "/LoginServlet","/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans javabeans = new JavaBeans();
  
    public LoginServlet() {
        super();
        System.out.println("Servlet de login sendo iniciado;");
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usnome = request.getParameter("usnome");
        String senha = request.getParameter("senha");
        javabeans.setUsnome(usnome);
        javabeans.setSenha(senha);

        try {
            if (dao.validate(javabeans)) {
                HttpSession session = request.getSession();
                session.setAttribute("usnome",usnome);
                response.sendRedirect("Sucesso.jsp");
            } else {
              
                response.sendRedirect("login.html");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	}


