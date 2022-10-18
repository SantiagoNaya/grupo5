package datos;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	Connection con;
	
	public void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bibloteca","root","");
			JOptionPane.showMessageDialog(null, "te conectaste ");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "NO te conectaste ");
		}
		}
	}
	


