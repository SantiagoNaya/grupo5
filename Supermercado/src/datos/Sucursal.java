package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Sucursal extends Usuario {
	
	
	
Conexion con = new Conexion();
	
	Connection conexion = con.conectar();
	
	PreparedStatement stmt;
	
	
	public Sucursal(String nombre, String password, int dni, int nivel
			) {
		super(nombre, password, dni, nivel);
		
		
		
		}
		
public Sucursal() {
		super();
		
	}




public boolean guardarSucursal(Sucursal sucursal) {
		
	String sql = "INSERT INTO supermercado.usuario(`dni`, `nombre`,`password`, `nivel` ) VALUES (?,?,?,?)"; 
	
		try {
			
			stmt = conexion.prepareStatement(sql);
			stmt.setInt(1,sucursal.getDni());
			stmt.setString(2,sucursal.getNombre());
			stmt.setString(3,sucursal.getPassword());
			stmt.setInt(4,sucursal.getNivel());
			
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
		return "Sucursal [id_sucursal=" +  ", nombre_sucursal=" +  
				 "]";
	}
	
	
	
}
