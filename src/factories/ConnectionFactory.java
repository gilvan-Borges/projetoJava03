package factories;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * classe para fabricar conexão para o banco de dados
 * Design pattern GOF: Factory Method
 */
public class ConnectionFactory {

	/*
	 * Método estático para retornar uma conexão com um banco de dados do postgreSQL
	 */

	public static Connection getConnetion() {

		Connection connection = null;// vazio

		try {

			// Abrindo conexão com o PostgreSQL
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula02", "postgres", "coti");

		} catch (Exception e) {
			System.out.println("\nFalha ao abrir conexão com o banco de dados.");
			System.out.println(e.getMessage());
		}

		return connection;

	}
}
