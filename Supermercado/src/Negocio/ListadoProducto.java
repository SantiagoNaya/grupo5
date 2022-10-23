package Negocio;

import java.util.LinkedList;

import javax.swing.JOptionPane;


import UI.Interfazventas;
import datos.*;

import UI.*;

public class ListadoProducto {

	public static void main(String[] args) {
		

		
		Interfaz i2 = new Interfaz();
		
		
		
	   
		
	}
	



LinkedList<Producto> Producto = new LinkedList<Producto>();
	Producto[] producto = new Producto[3];
	public boolean add(Producto productos) {
		
		char [] data = productos.getArticulo().toCharArray();
		
		
		if(data.length >= 3 && data.length <= 60 ) {
			String cantidad = productos.getCantidad();
			data = cantidad.toCharArray();
			if(data.length >= 1 && data.length <= 6 ) {
				String id_stock = productos.getId_stock();
				data = id_stock.toCharArray();
				
				if(data.length > 0) {
						
					int i = Producto.size()+1;
					producto[i] = productos;
							return true;
						}
					}
				}
				
				
		return false;
			}
}
			

		
		
