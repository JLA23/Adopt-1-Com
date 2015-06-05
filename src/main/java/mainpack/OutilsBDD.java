package mainpack;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class OutilsBDD {
	private Connection con;
	private Statement stmt;

	public OutilsBDD() {

	}

	public void connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:database.db");
			stmt = (Statement) con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}