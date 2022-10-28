package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class Usuario  {
	private String nombre;
	private String password;
	private String dni;
	private int nivel;
	
	Conexion con = new Conexion();

    Connection conexion = con.conectar();

    PreparedStatement stmt;
	
	public Usuario(String nombre, String password, String dni, int nivel) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.dni = dni;
		this.nivel = nivel;
	}
	
	
	
		
	 public Usuario() {
		
	}




	public LinkedList<Usuario> LlenarListaUsuario() {

	        String sql ="SELECT * FROM usuario"; 

	        String[] datos = new String[3];

	        LinkedList<Usuario> Usuarios = new LinkedList<Usuario>();
	        try {
	            stmt = conexion.prepareStatement(sql);

	            ResultSet result =  stmt.executeQuery();

	            while(result.next()) {
	                datos[0] = result.getString(1);
	                datos[1] = result.getString(2);
	                datos[2] = result.getString(3);
	                    //System.out.println("Nombre: " + datos[0] + " tipo: " + datos[1]);

	                Usuarios.add(new Usuario(datos[0],datos[1],datos[2],Integer.parseInt(datos[3])));

	            }

	            return Usuarios;
	        } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("error ");
	            return null;
	        }
	    }



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", dni=" + dni + ", nivel=" + nivel + "]";
	}



	
}
