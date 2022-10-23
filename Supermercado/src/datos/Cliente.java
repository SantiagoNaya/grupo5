package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Cliente extends Usuario {
	
	
	
Conexion con = new Conexion();
	
	Connection conexion = con.conectar();
	
	PreparedStatement stmt;
	
	
	public Cliente(String nombre, String password, String dni, int nivel) 
	
	{
		
		super(nombre, password, dni, nivel);
		
		
		
		}
		
	

	public boolean guardarSucursal(Cliente cliente) {
		
		String sql = "INSERT INTO supermercado.usuario(`dni`, `nombre`,`password`, `nivel` ) VALUES (?,?,?,?)"; 
	
		try {
			
			stmt = conexion.prepareStatement(sql);
			stmt.setString(1,cliente.getDni());
			stmt.setString(2,cliente.getNombre());
			stmt.setString(3,cliente.getPassword());
			stmt.setInt(4,cliente.getNivel());
			
		    stmt.executeUpdate();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return false;
		}
	}






@Override
public String toString() {
	return "Cliente [getNombre()=" + getNombre() + ", getPassword()=" + getPassword() + ", getDni()=" + getDni()
			+ ", getNivel()=" + getNivel() + "]";
}
	
	
	
	
	
	
	
	
	
}
