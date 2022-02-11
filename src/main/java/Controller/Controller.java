package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.DAO;
import Model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/cadastro" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans beans = new JavaBeans();

	public Controller() {
		super();
		System.out.println("Servlet sendo iniciado;");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String usnome = request.getParameter("usnome");
		String senha = request.getParameter("senha");

		beans.setCpf(cpf);
		beans.setEmail(email);
		beans.setSenha(senha);
		beans.setUsnome(usnome);

		dao.inserirUsuario(beans);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("Chamou pelo metodo post " + cpf + email + usnome + senha + " !");
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}