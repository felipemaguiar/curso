package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program2 {

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
			
			// Fazer o objeto st receber prepareStatement - recebe um comando sql
			st =  conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)" // tem que ser do mesmo modo que no banco de dados
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS); // inserir novos dados e retornar o id em que foi inserido
			
			//fazer os comandos para trocar os interrogações no que eu quiser
			st.setString(1, "Janaina Z");
			st.setString(2, "jana@gmail.com");
			//para adicionar uma data, primeiro chamamos o operador SimpleDateFormat no inicio do programa
			// segundo - java.sql.Date, depois chamamos o operador simpleDateFormat, 
			// terceiro - colocamos a data e por fim acrescentamos o getTime()
			st.setDate(3, new java.sql.Date(sdf.parse("24/01/1991").getTime()));
			st.setDouble(4, 8000.00);
			st.setInt(5, 2);
			
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
		catch(ParseException e) { // Tratamento de erro da data
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
