package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.JavaBeans;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/estacionamento";
	
	private String user = "root";
	
	private String password = "chuvisco224";


	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
	}

	public void inserirUsuario(JavaBeans usuarios) {
		String create = "insert into usuarios (usnome,senha,email,cpf) values (?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, usuarios.getUsnome());
			pst.setString(2, usuarios.getSenha());
			pst.setString(3, usuarios.getEmail());
			pst.setString(4, usuarios.getCpf());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	


	    public boolean validate( JavaBeans javabeans) throws ClassNotFoundException {
	        boolean status = false;

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/estacionamento", "root", "chuvisco224");

	            PreparedStatement preparedStatement = connection
	            .prepareStatement("select * from usuarios where usnome = ? and senha = ? ")) {
	            preparedStatement.setString(1, javabeans.getUsnome());
	            preparedStatement.setString(2, javabeans.getSenha());

	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	            status = rs.next();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return status;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}

