package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Producto {
private String nombre;
private int cantidad;
private int id_producto;
private double precio;

Conexion con = new Conexion();

Connection conexion = con.conectar();

PreparedStatement stmt;

public boolean guardarProducto(Producto productos) {

    String sql = "INSERT INTO supermercado.producto(id_producto, cantidad,nombre, precio ) VALUES (?,?,?,?)"; 
     
    
        try {

            stmt = conexion.prepareStatement(sql);
            stmt.setInt(1,productos.getId_producto());
            stmt.setInt(2,productos.getCantidad());
            stmt.setString(3,productos.getNombre());
            stmt.setDouble(4,productos.getPrecio());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error");
            return false;
        }
    }

public Producto(String nombre, int cantidad, int id_producto, double precio) {
	super();
	this.nombre = nombre;
	this.cantidad = cantidad;
	this.id_producto = id_producto;
	this.precio= precio;
}


public Producto() {
	super();
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public int getId_producto() {
	return id_producto;
}

public void setId_producto(int id_producto) {
	this.id_producto = id_producto;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Producto [articulo=" + nombre + ", cantidad=" + cantidad + ", id_stock=" + id_producto + ", precio=" + precio
			+ "]";
}






}
