package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		//Como atualizar dados
		
		// VAMOS FAZER UM PROGRAMA PARA ATUALIZAR O SAL�RIO DE UM VENDEDOR
		
		Connection conn = null;
		Statement st = null;
		
		//Conectar com o banco de dados
		try {
			conn = DB.getConnection();	
			
			//Precisamos proteger o programa  ou ele execute tudo ou n�o execute nada - lembrando a
			//ideia de transfer�ncia banc�ria
			conn.setAutoCommit(false); // N�o � para confirmar as opera��es autom�ticamente - ela ficar� 
			//pendente a espera do programador
						
			st = conn.createStatement(); 
			
			
			//Atualizando - todo vendedor departmentId = 1 o sal�rio ser� atualizado
			int linhas1 = st.executeUpdate("UPDATE seller SET BaseSalary = 3100 WHERE DepartmentId = 1");
			
			//SIMULAR UMA FALHA PARA GERAR UMA EXCE��O NO MEIO DO CAMINHO
			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake Error");
			//}
			
			int linhas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 4500 WHERE DepartmentId = 2");

			conn.commit(); // Depois de realizar todas as transa��es, iremos confirma-l�s para atualizar o 
			//banco de dados
			
			System.out.println("Linha1 " + linhas1);
			System.err.println("Linha2 " + linhas2);
			
					
		}
		catch (SQLException e) {
			// caso tenha algum erro, devemos fazer o programa voltar desde o inicio
			try {
				conn.rollback();
				throw new DbException("Transa��o rolled back! Causada por: " + e.getMessage());
			} catch (SQLException e1) {
				// aqui � quando h� uma exce��o do rollback
				throw new DbException("Erro trying to rollback! Causado por: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st); // fechar o statement
			DB.closeConnection(); // fechar o connection
		}
	}

}
