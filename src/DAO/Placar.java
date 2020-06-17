package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Placar {

	ConexaoBD con = new ConexaoBD();

	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	Scanner scan = new Scanner(System.in);

	String nome;
	int id;
	int placar;

	public void  escreverPlacar(int id, String nome, int vitoria) throws Exception {

		/*System.out.println("Digite um id e nome e vitorias");
		id = scan.nextInt();
		nome = scan.next();
		placar = scan.nextInt();*/
		
		
		con.conexao();

		String sql = null;

		// Statements allow to issue SQL queries to the database
		statement = con.getConnect().createStatement();

		// Result set get the result of the SQL query
		sql = ("insert into tbl_placar values" + "(" + id + "," + "'" + nome + "'" + "," + vitoria + ");");
		statement.executeUpdate(sql);

		System.out.println("sucesso!");
	}

}
