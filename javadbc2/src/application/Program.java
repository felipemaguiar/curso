package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		
		
		Connection conn = null;	// conecta com o banco	
		Statement st = null; // abre uma consulta sql
		ResultSet rs = null; // resultado da consulta fica guardado no resultSet
		
		try {
			conn = DB.getConnection(); // conectar o banco de dados
			
			// estanciar o objeto do tipo statement para consultar no banco de dados
			st = conn.createStatement();
			
			// chamo o executeQuery para passar o camando SQL e fazer a consulta
			//o resultado da consulta atribuimos ao rs que � o resultSet, por isso rs =
			rs = st.executeQuery("select * from department"); // seleciota tudo da tabela department
			
			// para percorrer os dados da tabela utilizamos a fun��o next()
			// lembrando que o rs come�a na posi��o zero e retorna falso quando estiver no ultimo
			while(rs.next()) {
				//Id � um n�mero inteiro por isso o getInt
				//Name � uma string por isso getStrin
				//Imprimir = pega o inteiro que est� no campo id e pega a string que est� no campo name
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); 
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// Importante fechar os recursos externos, que n�o sao controlados pela JVM, ent�o
			//devemos fechar manualmente para nao ter vazamento de memoria
			//rs.close(); //lna�a um exce��o - criar um try catch na classe DB
			//st.close(); // lan�a uma exce��o - criar um try catch na classe DB
			
			// arrumando da maneira correta
			DB.closeResultSet(rs);
			DB.closeStatement(st);			
			DB.closeConnection();
		}

	}

}
