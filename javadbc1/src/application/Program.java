package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		
		//Abrir a conex�o com o banco de dados
		Connection conn = DB.getConnection(); // Crio um connection do proprio java e chamo a minha co��o criada
		//em DB.GetConnection
		
		//Fechar a conex�o com o banco de dados
		DB.closeConnection();

	}

}
