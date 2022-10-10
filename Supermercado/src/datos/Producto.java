package datos;

public class Producto {
private String articulo;
private String cantidad;
private String id_stock;
private String precio;

public Producto(String articulo, String cantidad, String id_stock, String precio) {
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

public String getCantidad() {
	return cantidad;
}

public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}

public String getId_stock() {
	return id_stock;
}

public void setId_stock(String id_stock) {
	this.id_stock = id_stock;
}


public String getPrecio() {
	return precio;
}


public void setPrecio(String precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Producto [articulo=" + articulo + ", cantidad=" + cantidad + ", id_stock=" + id_stock + ", precio=" + precio
			+ "]";
}






}
