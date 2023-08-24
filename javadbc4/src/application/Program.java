package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//Como atualizar dados
		
		// VAMOS FAZER UM PROGRAMA PARA ATUALIZAR O SALÁRIO DE UM VENDEDOR
		
		Connection conn = null;
		PreparedStatement st = null;
		
		//Conectar com o banco de dados
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement( //Comando para atualizar o banco de dados
					"UPDATE seller " // vendedor vai ser atualizado
					+ "SET BaseSalary = BaseSalary + ? " // baseSalary recebe o salário mais um incremento ?
					+ "WHERE " // acrescentamos a restrição, é importante ter restrição
					+ "(DepartmentId = ?)"); // vai atualizar quando o id for o número que eu escolher
			
			st.setDouble(1, 250.0); //primeiro interrogação
			st.setInt(2, 4); // segundo interrogação
			
			int linhaAfetada =  st.executeUpdate();
			
			System.out.println("Pronto! Linhas afetadas: " + linhaAfetada);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st); // fechar o statement
			DB.closeConnection(); // fechar o connection
		}
	}

}
