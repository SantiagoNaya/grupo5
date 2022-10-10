package UI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import datos.*;
import Negocio.Stock;

public class Interfaz {

	
	static Scanner entrada = new Scanner(System.in);
	
	static Stock Productos = new Stock();
	
	
	public void Login() {
		
		
		System.out.println("Bienvenido");
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
		System.out.println("Por favor escoja una de los siguientes niveles");
		System.out.println("Para acceder a la opci贸n escriba el numero que corresponda");
		System.out.println("1.Sucursal");
		System.out.println("2.SectorVenta");
		System.out.println("3.Operario");
		System.out.println("4.Gerente");
		System.out.println("5.Salir");
		
		int opcion = entrada.nextInt();
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
			//Salir();
		break;
			default: System.out.println("Se eligio una opci贸n incorrecta volver a intentar");
				break;
			}
	}
	
	private void menuAlter() {
		System.out.println("1.Crear pedido");
		System.out.println("2.Ver productos");
		System.out.println("3.Salir");
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: Crear();
			break;
		case 2: 
		//	Buscar();
			break;
		case 3: 
			//Salir();
			break;
			default: System.out.println("Se eligio una opci贸n incorrecta volver a intentar");
				break;
			}
	}
	
	private void Crear() {

		
	
		System.out.println("Ingrese la fecha de envio");		
		Boleta boleta = new Boleta();
		boleta.setFecha(entrada.next());
		System.out.println("Elija los productos a comprar");
		
		
		int flag =0;
		
		do {
		//Podes utilizar los array de string para mostrar la lista de productos y queda un poco mas lindo y mostras las opciones directamtne 
		String[] Producto = {"Queso", "Pan", "Coca cola", "Papas fritas", "Patys", "Helado", "salir"};
		
		Object selection = JOptionPane.showInputDialog(null,"Elija un producto",
				"Seleccion",JOptionPane.QUESTION_MESSAGE,null,Producto,null);
		
		if(selection.equals("salir")) {
			flag =1;
		}else{
			JOptionPane.showMessageDialog(null, selection);
		 String cantidad = JOptionPane.showInputDialog(null, "Ingrese cantiad");
		
		 boleta.setContenido(selection);
		 boleta.setCantidad(cantidad);
		 
		 if(Productos.add(boleta)) {
			JOptionPane.showMessageDialog(null, "Se a馻dio a la boleta el producto : " + selection);
		 }else {
				JOptionPane.showMessageDialog(null, "Error al a馻dirse");
		 }
		}
		
		
		}while(flag !=1);
		
		
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		
		case 1: 
		
			break;
		case 2: 
			//SobreCarga(p2);
		
		break;
			
		case 3: 
			
			//SobreCarga(p3);
		
		break;
		case 4: 
			//Salir();
			break;
			default: System.out.println("Se eligio una opci贸n incorrecta volver a intentar");
				break;
			}
		boleta.setContenido(entrada.next());
		System.out.println("Ingrese el DNI: ");
		/*alumno.setDni(entrada.next());
		 if(legajo.add(alumno)== true) {
			 System.out.println("Se agrego correctamente el alumno");
		 }else {
			 System.out.println("no se pudo agregar correctamente");
				System.out.println("si deseas agregar nuevamente un contacto ");
				System.out.println("seleccionar opcion 1");	
		 }
		 imprimirMenu();
		 
	}
	private void menuAlter( ) {
		System.out.println("1.Borrar alumno ");
		System.out.println("2.Editar alumno");
		System.out.println("3.Menu principal");
		
		
			
	}
	*/
	}

	private String String(Object showInputDialog) {
		// TODO Auto-generated method stub
		return null;
	}
}
