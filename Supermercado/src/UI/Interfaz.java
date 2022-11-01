package UI;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import UI.*;

import datos.*;
import Negocio.*;


public class Interfaz {

	
	static Scanner entrada = new Scanner(System.in);
	
	static ListadoProducto Productos = new ListadoProducto();
	
	static ListadoUsuario Usuarios = new ListadoUsuario();
	
	static ListadoBoleta Boletas = new ListadoBoleta();
	
	static Usuario usuario = new Usuario();
	
	InterfazOperario interfazoperario = new InterfazOperario();
	
	Interfazventas interfazventas = new Interfazventas();
	
	InterfazGerente interfazgerente = new InterfazGerente();
	
	
	
	
	
	private void IngresarAdmin() {
		
		JOptionPane.showMessageDialog(null, "Registro de Admin:");
		
		Adminventas adminventa = new Adminventas();
		adminventa.setDni(JOptionPane.showInputDialog("Ingrese dni"));
		adminventa.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario:"));
		adminventa.setPassword(JOptionPane.showInputDialog("Ingrese password:"));
		adminventa.setNivel(1);
		
		if(Usuarios.add(adminventa)) {
			 JOptionPane.showMessageDialog(null, "Se agregó correctamente el Adminventas.");
			 Login();
		 }else {
			 JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Adminventas.");
			 IngresarAdmin();
		 }
		
		 
	}
	
	
	private void IngresarOperario() {
		
		JOptionPane.showMessageDialog(null, "Registro de Operario: ");
		
		Operario operarios = new Operario();
		operarios.setDni(JOptionPane.showInputDialog("Ingrese dni"));
		operarios.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario:"));
		operarios.setPassword(JOptionPane.showInputDialog("Ingrese password:"));
		operarios.setNivel(0);
		
		if(Usuarios.add(operarios)) {
			 JOptionPane.showMessageDialog(null, "Se agregó correctamente el Operario.");
			 Login();
		 }else {
			 JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Operario.");
			 IngresarOperario();
		 }
		
		 
	}
private void IngresarGerente() {
		
	JOptionPane.showMessageDialog(null, "Registro de Gerente: ");
	
		Gerente gerentes = new Gerente();
		gerentes.setDni(JOptionPane.showInputDialog("Ingrese dni"));
		gerentes.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario:"));
		gerentes.setPassword(JOptionPane.showInputDialog("Ingrese password:"));
		gerentes.setNivel(2);
		
		if(Usuarios.add(gerentes)) {
			 JOptionPane.showMessageDialog(null, "Se agregó correctamente el Gerente.");
			 Login();
		 }else {
			 JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Gerente.");
			 IngresarGerente();
		 }
		 
		 
	}
	
	
	public void Login() {

		
		
		JOptionPane.showMessageDialog(null, "¡Bienvenido Usuario!");
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción correspondiente:\n"
				+ "1-Iniciar sesión\n"
				+ "2-Registrarse"));
		
		switch (opcion) {
		case 1: 
			
			IniciarSesion();
		
			break;
		case 2:
			
			CrearUsuario();
			
			break;
		
			default: JOptionPane.showMessageDialog(null,"Se eligio una opción incorrecta volver a intentar");
				break;
			}
		
		
	}
	
	
private void CrearUsuario() {
		
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el tipo de usuario que desea crear:\n "
				+ "1-Operario\n"
				+ "2-Gerente\n"
				+ "3-Adminventas"));
		
		switch (opcion) {
		case 1: 
			
			IngresarOperario();
			break;
		case 2:
			
			IngresarGerente();
			
			break;
		case 3: 
			IngresarAdmin();
			break;
		
			default: JOptionPane.showMessageDialog(null,"Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	

	
	private Usuario IniciarSesion() {
		
		
		
	    LinkedList<Usuario> usuarios = usuario.LlenarListaUsuario();
	    String[] UsuariosMostrar = new String[usuarios.size()];

	    for (Usuario cuentas : usuarios) {
	        UsuariosMostrar[usuarios.indexOf(cuentas)] = cuentas.getNombre() + cuentas.getPassword() + cuentas.getNivel();
	        
	     
	    }

	    for (Usuario cuentas : usuarios) {
	        
	    	System.out.println(cuentas.getNombre() + " " + cuentas.getPassword() + " " + cuentas.getNivel() + "\n");
	    	
	    }
	    
	    
	    String nombre = (String) JOptionPane.showInputDialog("Ingrese su nombre");

	    String password = (String) JOptionPane.showInputDialog("Ingrese su password");

	    
	    
	    if (nombre != null && password != null) {
	        
	    	JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nPassword: " + password);
	    	int flag = 0;
	    	int nivel = 0;
	        for (Usuario cuentas : usuarios) {
	        	
	            if (cuentas.getNombre().equals(nombre) && cuentas.getPassword().equals(password)) {
	            	
	            	flag = 1;
	            	nivel = cuentas.getNivel();
	            }
	            }
	        
	        if(flag == 1) {
	        	
	        	
	        
	        
	            	switch (nivel) {
	        		case 0: 
	        			
	        			interfazoperario.login();
	        			
	        			break;
	        		case 1:
	        			
	        			interfazventas.login();
	        			
	        			break;
	        		case 2: 
	        			
	        			interfazgerente.login();
	        			
	        			break;
	        		
	        			
	            	
	                	} 

	            	
	            	} else {
	            		
	            		JOptionPane.showMessageDialog(null, "Incorrecto");
	            		IniciarSesion();
	            }
	        }
	    

	    
	    return null;



	}
	
	
	/*private void SobreCarga() {
		
		 sucursal = new Cliente();
		sucursal.setDni(123456);
		sucursal.setNombre("Pepsi");
		sucursal.setPassword("123456");
		sucursal.setNivel(1);
		Productos.add(sucursal);
		
		
	}   */
	
	
	
	
	private void menuAlter() {
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Para acceder a la opción escriba el numero que corresponda:\n"+
				"1.Crear pedido\n"+ "2.Ver productos\n"+ "3.Salir"));
		switch (opcion) {
		case 1:
			break;
		case 2: 
			   
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
