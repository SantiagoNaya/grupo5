package datos;

import java.util.Date;

public class Boleta {
	
private int id_boleta;
private int cantidad;
private Date fecha;

public Boleta(int id_boleta,  Date fecha, int cantidad) {
	super();
	this.id_boleta = id_boleta;
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



public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}


public int getCantidad() {
	return cantidad;
}



public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}



@Override
public String toString() {
	return "Boleta [id_boleta=" + id_boleta + ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
}









}
