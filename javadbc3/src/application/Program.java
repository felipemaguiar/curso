package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

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
					+ "(?, ?, ?, ?, ?)");
			
			//fazer os comandos para trocar os interrogações no que eu quiser
			st.setString(1, "Felipe Magalhães");
			st.setString(2, "felipe@gmail.com");
			//para adicionar uma data, primeiro chamamos o operador SimpleDateFormat no inicio do programa
			// segundo - java.sql.Date, depois chamamos o operador simpleDateFormat, 
			// terceiro - colocamos a data e por fim acrescentamos o getTime()
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1989").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 4);
			
			// para alterar os dados ou acrescentar dados chamamos o executeUpdate()
			int linhasAfetadas = st.executeUpdate(); // resulta em um número inteiro indicando quantas linhas foram afetadas
			
			System.out.println("Pronto! Linhas afetadas: " + linhasAfetadas);
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
