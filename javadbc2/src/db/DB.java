package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	// Connectar e desconectar ao banco de dados - metodos est�ticos
	
	//CRIAR UM M�TODO PARA CONECTAR COM O BANCO DE DADOS
	private static Connection conn = null;
	
	//CRIANDO O M�TODO PARA CONECTAR COM O BANCO DE DADOS
	public static Connection getConnection() {
		// O METODO TER� QUE RETORNAR O OBJETO CONN DECLARADO ACIMA
		if (conn == null) { // se o banco de dados estiver desconectado
			try { //tentar conectar
				Properties props = loadProperties(); // chama o load props que abre o arquivo dbproperties
				String url = props.getProperty("dburl"); // seleciona a url que est� no arquivo
				conn = DriverManager.getConnection(url, props); // conecta com o banco de dados
			}
			catch (SQLException e) { // se nao conseguir conectar passar o erro que criamos
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	//M�TODO PARA FECHAR A CONEC��O
	public static void closeConnection() {
		if (conn != null) {// testando se o conn � diferente de nulo
			try { // tentar desconectar
				conn.close();
			}
			catch (SQLException e) { // se nao conseguir desconectar passar o erro que criamos
				throw new DbException(e.getMessage());
			}
		}
	}
	
	//M�TODO AUXILIARES PARA CARREGAR OS DADOS QUE EST�O DENTRO DO ARQUIVO db.properties	
	//METODO PRIVATE PQ S� VAI SER USADO DENTRO DA CLASSE
	private static Properties loadProperties() {
		
		//Abrir o arquivo
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties(); // cria props no formato properties
			props.load(fs); //load faz a leitura do arquivo e guarda os dados em props
			return props;
		}
		catch(IOException e) { 
			//se surgir algum erro ele ir� retornar a msg que criamos em Db Exception
			throw new DbException(e.getMessage());
		}
	}
	
	// Fechar o objeto do tipo statment que foi criado no programa principal, para l� nao ter que ficar
	// colocando try e catch
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				//se der erro passo a minha msg criada em DbException
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				//se der erro passo a minha msg criada em DbException
				throw new DbException(e.getMessage());
			}
		}
	}
}
