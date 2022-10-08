package datos;

import java.util.Date;

public class Boleta {
private String id_boleta;
private String contenido;
private Date fecha;

public Boleta(String id_boleta, String contenido, Date fecha) {
	super();
	this.id_boleta = id_boleta;
	this.contenido = contenido;
	this.fecha = fecha;
	
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

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

@Override
public String toString() {
	return "Boleta [id_boleta=" + id_boleta + ", contenido=" + contenido + ", fecha=" + fecha + "]";
}


}
