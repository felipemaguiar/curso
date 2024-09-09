package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		//Como atualizar dados
		
		// VAMOS FAZER UM PROGRAMA PARA ATUALIZAR O SALÁRIO DE UM VENDEDOR
		
		Connection conn = null;
		PreparedStatement st = null;
		
		//Conectar com o banco de dados
		try {
			conn = DB.getConnection();
			

			st = conn.prepareStatement( //ESCREVE O COMANDO SQL PARA DELETAR
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");	
			
			st.setInt(1, 2);
			
			int linhaAfetada =  st.executeUpdate();
			
			System.out.println("Pronto! Linhas afetadas: " + linhaAfetada);
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage()); // colocamos a nossa propria exceção
		}
		finally {
			DB.closeStatement(st); // fechar o statement
			DB.closeConnection(); // fechar o connection
		}
	}

}
