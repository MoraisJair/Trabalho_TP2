package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conectaBanco {
	private static final String DRIVER = "com.mysql.jdbc.Driver"; 
	private static final String BANCO = "jdbc:mysql://localhost:3306/caixaATM"; 
	private static final String USUARIO = "root"; 
	private static final String SENHA = "teste"; 
	
	public static Connection getConnection(){
		try{ 
      		Class.forName(DRIVER);
       		return DriverManager.getConnection(BANCO, USUARIO, SENHA);
      	}catch(ClassNotFoundException | SQLException ex){
       		throw new RuntimeException("FALHA NA CONEXÃO", ex);
    	}
		
	} 

	public static void closeConnection(Connection conexao){
		if(conexao != null){
			try{
           		conexao.close();
			}catch(SQLException ex){
           		System.err.println("Erro: "+ex);
			}
		}
	}
    
	public static void closeConnection(Connection conexao, PreparedStatement stmt){
		if(stmt != null){
			try{
				stmt.close();
			}catch(SQLException ex){
             	System.err.println("Erro: "+ex);
			}
		}
		closeConnection(conexao);        
	}
}
