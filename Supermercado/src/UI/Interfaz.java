package UI;

import java.util.Scanner;

import Datos.Alumno;
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
		System.out.println("Para acceder a la opción escriba el numero que corresponda");
		System.out.println("1.Sucursal");
		System.out.println("2.SectorVenta");
		System.out.println("3.Operario");
		System.out.println("4.Gerente");
		System.out.println("5.Salir");
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: menuAlter();
			break;
		//case 2: SectorVenta();
		//	break;
	//	case 3: Operario();
		//	break;
	//	case 4: Gerente();
		//	break;
		case 5: Salir();
		break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
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
		case 2: verPerfiles();
			break;
		case 3: Salir();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	
	private void Crear() {
		System.out.println("Ingrese la fecha de envio");		
		Boleta boleta = new Boleta();
		boleta.setFecha(entrada.next());
		System.out.println("Elija los productos a comprar");
		
		
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		
		case 1: SobreCarga(p1);
		
			break;
		case 2: SobreCarga(p2);
		
		break;
			
		case 3: SobreCarga(p3);
		
		break;
		case 4: Salir();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
			}
		
		boleta.setContenido(entrada.next());
		
		
		 if(Productos.add(boleta)== true) {
			 System.out.println("El producto se agregó correctamente");
				System.out.println("Si deseas agregar otro producto ");
				System.out.println("Seleccione la opcion correspondiente");	
		 }else {
			 System.out.println("No hay stock del producto selecionado");	
		 }
		 imprimirMenu();
		 
	}
	private void verPerfiles() {
		System.out.println(Productos.getProducto());
		imprimirMenu();
		
	}
	private void Salir() {
		System.out.println("El programa finalizo");
		System.exit(0);
	}
	
}
