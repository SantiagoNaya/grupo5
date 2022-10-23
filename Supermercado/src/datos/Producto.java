package datos;

public class Producto {
private String nombre;
private int cantidad;
private int id_producto;
private double precio;

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
