package datos;

import java.util.Date;

public class Boleta {
private int id_boleta= 1;
private Object contenido;
private int cantidad;
private Date fecha;

public Boleta(int id_boleta, Object contenido, Date fecha, int cantidad) {
	super();
	this.id_boleta = id_boleta;
	this.contenido = contenido;
	this.fecha = fecha;
	this.cantidad=cantidad;
	
}



public Boleta() {
	super();
}



public int getId_boleta() {
	return id_boleta;
}

public void setId_boleta(int id_boleta) {
	this.id_boleta = id_boleta;
}

public Object getContenido() {
	return contenido;
}

public void setContenido(Object contenido) {
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
	return "Resumen de boleta\n" + "Boleta nro:  " + id_boleta + "\nfecha de entrega: " + fecha +"\nContenido: " + contenido + "\nCantidad: " + cantidad 
			;
}






}
