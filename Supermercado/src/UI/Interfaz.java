package UI;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import datos.*;
import Negocio.Stock;

public class Interfaz {

	
	static Scanner entrada = new Scanner(System.in);
	
	static Stock Productos = new Stock();
	
	
	public void Login() {
		
		JOptionPane.showMessageDialog(null, "¡Bienvenido Usuario!");
		
		imprimirMenu();
	}
	
	private void SobreCarga() {
		Producto p1 = new Producto();
		p1.setArticulo("Harina");
		p1.setCantidad("10");
		p1.setId_stock("1");
		Productos.add(p1);
		Producto p2 = new Producto();
		p1.setArticulo("Carne");
		p1.setCantidad("15");
		p1.setId_stock("2");
		Productos.add(p2);
		Producto p3 = new Producto();
		p1.setArticulo("Arroz");
		p1.setCantidad("20");
		p1.setId_stock("3");
		Productos.add(p3);
		
	}
	
	private void imprimirMenu() {
		
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escoja una de los siguientes niveles:\n"
				 + "1.Sucursal\n" + "2.SectorVenta\n"+ 
				"3.Operario\n" + "4.Gerente\n" + "5.Salir"));
		switch (opcion) {
		case 1: 
			Sucursal sucursal = new Sucursal();
			menuAlter();
			//Sucursal();
			break;
		case 2:
			
			//SectorVenta();
			break;
		case 3: 
			//Operario();
			break;
		case 4:
			//Gerente();
			break;
		case 5:
			   Salir();
		break;
			default: JOptionPane.showMessageDialog(null,"Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	
	private void menuAlter() {
		
		
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Para acceder a la opción escriba el numero que corresponda:\n"+
				"1.Crear pedido\n"+ "2.Ver productos\n"+ "3.Salir"));
		switch (opcion) {
		case 1: Crear();
			break;
		case 2: 
			verPerfiles();
			break;
		case 3: 
			Salir();
			break;
			default: JOptionPane.showMessageDialog(null,"Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	
	private void Crear() {

		
	
				
		Boleta boleta = new Boleta();
		boleta.setFecha(JOptionPane.showInputDialog("Ingrese la fecha de envio:"));
		
		
		
		int flag =0;
		
		do {
		//Podes utilizar los array de string para mostrar la lista de productos y queda un poco mas lindo y mostras las opciones directamtne 
		String[] Producto = {"Queso", "Pan", "Coca cola", "Papas fritas", "Patys", "Helado", "Salir"};
		
		Object selection = JOptionPane.showInputDialog(null,"Elija un producto:",
				"Seleccion",JOptionPane.QUESTION_MESSAGE,null,Producto,null);
		
		if(selection.equals("Salir")) {
			flag =1;
		}else{
			JOptionPane.showMessageDialog(null, selection);
		 String cantidad = JOptionPane.showInputDialog(null, "Ingrese cantidad:");
		 
		
		 boleta.setContenido(selection);
		 boleta.setCantidad(cantidad);
		 
		 if(Productos.add(boleta)) {
			
			 int opcion = Integer.parseInt(JOptionPane.showInputDialog("Para acceder a la opción escriba el numero que corresponda:\n"+
						"1.Crear otro Pedido\n" + "2.Salir"));
				switch (opcion) {
				case 1: Crear();
					break;
				case 2: Salir();
				break;
				}
		 }else {
				JOptionPane.showMessageDialog(null, "Error del sistema.");
		 }
		} 
		
		
		}while(flag !=1);
		
		
		
		
	}

	private String String(Object showInputDialog) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void verPerfiles() {
		
		String[] Producto = {"Listado de productos: \n","Queso\n", "Pan\n", "Coca cola\n", "Papas fritas\n", "Patys\n", "Helado"};
		
		JOptionPane.showMessageDialog(null, Producto);
		
		
	}
	
	private void Salir() {
		JOptionPane.showMessageDialog(null,"¡Hasta luego!");
		System.exit(0);
	}
}
