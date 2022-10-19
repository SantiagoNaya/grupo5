package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Sucursal extends Usuario {
	private int id_sucursal;
	private String nombre_sucursal;
	
Conexion con = new Conexion();
	
	Connection conexion = con.conectar();
	
	PreparedStatement stmt;
	
	
	public Sucursal(String nombre, String password, int dni, int nivel, int id_sucursal, String nombre_sucursal
			) {
		super(nombre, password, dni, nivel=0);
		this.id_sucursal = id_sucursal;
		this.nombre_sucursal = nombre_sucursal;
		}
		
	public Sucursal() {
		super();
	}
	public int getId_sucursal() {
		return id_sucursal;
	}
	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
public boolean guardarSucursal(Sucursal sucursal) {
		
		String sql ="INSERT INTO `usuario`(`dni`, `nombre`, `nombre_sucursal`, `nivel`, `password`) VALUES (?,?,?,?,?)"; 
	
		try {
			stmt = conexion.prepareStatement(sql);
			
			stmt.setInt(1,sucursal.getDni());
			stmt.setString(2,sucursal.getNombre());
			stmt.setString(3,sucursal.getNombre_sucursal());
			stmt.setInt(3,sucursal.getNivel());
			stmt.setString(4,sucursal.getPassword());
		    stmt.executeUpdate();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error ");
			return false;
		}
	}
	public String getNombre_sucursal() {
		return nombre_sucursal;
	}
	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Sucursal [id_sucursal=" + id_sucursal + ", nombre_sucursal=" + nombre_sucursal + 
				 "]";
	}
	
	
	
}
