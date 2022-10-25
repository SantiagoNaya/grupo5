package Negocio;

import java.util.LinkedList;

import javax.swing.JOptionPane;


import UI.Interfazventas;
import datos.*;

import UI.*;



public class ListadoProducto {
	
	

	public static void main(String[] args) {
				
		Interfaz i2 = new Interfaz();
		i2.Login();	
	}
	

	
	public boolean add(Producto productos) {
		Producto producto = new Producto();
		char [] data = productos.getNombre().toCharArray();
				
		if(data.length >= 3 && data.length <= 60 ) {
			int cantidad = productos.getCantidad();
			if(cantidad >= 1) {
				int id_stock = productos.getId_producto();				
				if(id_stock > 0) {					
					double precio = productos.getPrecio();
					if (precio > 0) {					
						producto.guardarProducto(producto);
					}						
						}
					}
				}								
		return false;
			}
}
			

		
		
