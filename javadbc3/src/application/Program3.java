package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program3 {

	public static void main(String[] args) {
		
		// VAMOS INSERIR NOVOS VENDEDORES NO BANCO DE DADOS
		
		//MAIS A FRENTE VAMOS PRECISAR INSTANCIAR DATAS - TRABALHANDO COM DATAS
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		//conecçaõ recebendo null
		Connection conn = null;
		//utilizando o operador prepareStatement
		PreparedStatement st = null;
		
		//programação para inserir um dado no banco de dados
		try {
			conn = DB.getConnection(); // conectando com o banco de dados
			
			// Outro método para adicionar dados no banco de dados
			st = conn.prepareStatement(
					"INSERT INTO department (Name) value ('DEP1'),('DEP2')",
					Statement.RETURN_GENERATED_KEYS);
			
			// para alterar os dados ou acrescentar dados chamamos o executeUpdate()
			int linhasAfetadas = st.executeUpdate(); // resulta em um número inteiro indicando quantas linhas foram afetadas
			
			if (linhasAfetadas > 0) {
				ResultSet rs = st.getGeneratedKeys(); // retorna o objeto resultSet com um ou mais valores
				while (rs.next()) {
					int id = rs.getInt(1); // pegar o valor da primeira coluna
					System.out.println("Pronto! Id = " + id);
				}
			}
			else {
				System.out.println("Nenhuma linha afetada!");
			}
		}
		catch(SQLException e) { // Tratamento de erro do SQL
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
