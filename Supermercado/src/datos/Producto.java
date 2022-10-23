package datos;

public class Producto {
private String articulo;
private int cantidad;
private int id_stock;
private double precio;

public Producto(String articulo, int cantidad, int id_stock, double precio) {
	super();
	this.articulo = articulo;
	this.cantidad = cantidad;
	this.id_stock = id_stock;
	this.precio= precio;
}


public Producto() {
	super();
}


public String getArticulo() {
	return articulo;
}

public void setArticulo(String articulo) {
	this.articulo = articulo;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public int getId_stock() {
	return id_stock;
}

public void setId_stock(int id_stock) {
	this.id_stock = id_stock;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Producto [articulo=" + articulo + ", cantidad=" + cantidad + ", id_stock=" + id_stock + ", precio=" + precio
			+ "]";
}






}
