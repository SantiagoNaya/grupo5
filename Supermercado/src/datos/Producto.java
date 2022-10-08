package datos;

public class Producto {
private String articulo;
private int cantidad;
private int id_stock;

public Producto(String articulo, int cantidad, int id_stock) {
	super();
	this.articulo = articulo;
	this.cantidad = cantidad;
	this.id_stock = id_stock;
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

@Override
public String toString() {
	return "Producto [articulo=" + articulo + ", cantidad=" + cantidad + ", id_stock=" + id_stock + "]";
}



}
