package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ConexaoBD {

	private Connection connect = null;


	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "";

	public void conexao() throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "/jogodavelha?" + "user=" + user + "&password=" + passwd);
		} catch (Exception ex) {
			System.out.println("Erro ao abrir a conexão do banco: " + ex);
		}
	}

	public Connection getConnect() {
		return connect;
	}

	public void setConnect(Connection connect) {
		this.connect = connect;
	}
	
	

}