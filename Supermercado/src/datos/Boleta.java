package datos;

import java.util.Date;

public class Boleta {
private String id_boleta;
private String contenido;
private String cantidad;
private String fecha;

public Boleta(String id_boleta, String contenido, String fecha, String cantidad) {
	super();
	this.id_boleta = id_boleta;
	this.contenido = contenido;
	this.fecha = fecha;
	this.cantidad=cantidad;
}



public Boleta() {
	super();
}



public String getId_boleta() {
	return id_boleta;
}

public void setId_boleta(String id_boleta) {
	this.id_boleta = id_boleta;
}

public String getContenido() {
	return contenido;
}

public void setContenido(String contenido) {
	this.contenido = contenido;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}


public String getCantidad() {
	return cantidad;
}



public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}



@Override
public String toString() {
	return "Boleta [id_boleta=" + id_boleta + ", contenido=" + contenido + ", cantidad=" + cantidad + ", fecha=" + fecha
			+ "]";
}






}
