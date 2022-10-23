package UI;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import UI.Interfazventas;

import datos.*;
import Negocio.Stock;

public class Interfaz {

	
	static Scanner entrada = new Scanner(System.in);
	
	static Stock Productos = new Stock();
	
	
	
	
	private void Ingresar() {
		
		Sucursal sucursal = new Sucursal();
		 sucursal.setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese dni")));
		 sucursal.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario:"));
		 sucursal.setPassword(JOptionPane.showInputDialog("Ingrese nombre de password:"));
		 sucursal.setNivel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nivel:")));
		
		if(Productos.add(sucursal)== true) {
			 JOptionPane.showMessageDialog(null, "Se agregó correctamente el usuario.");
		 }else {
			 JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el usuario.");
		 }
		 imprimirMenu();
		 
	}
	
	
	public void Login() {

		
		
		JOptionPane.showMessageDialog(null, "¡Bienvenido Usuario!");
		
		Ingresar();
		imprimirMenu();
		
		
		
	}
	
	private void SobreCarga() {
		
		Sucursal sucursal = new Sucursal();
		sucursal.setDni(123456);
		sucursal.setNombre("Pepsi");
		sucursal.setPassword("123456");
		sucursal.setNivel(1);
		Productos.add(sucursal);
		
		
	}
	
	
	
	/*
	 Hasta aqui es cliente. 
	 
	 */
	
	
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
	
	private void Salir() {
		JOptionPane.showMessageDialog(null,"¡Hasta luego!");
		System.exit(0);
	}
	
}
