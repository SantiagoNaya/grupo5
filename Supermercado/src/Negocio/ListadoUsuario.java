package Negocio;


import java.util.LinkedList;
import javax.swing.JOptionPane;
import datos.*;
import UI.*;

public class ListadoUsuario {

	public static void main(String[] args) {
		
		Interfaz i1 = new Interfaz();
		
		i1.Login();
		
		LinkedList<Usuario> usuario = new LinkedList<Usuario>();
		
		public boolean add(Cliente cliente) {
			
			if(cliente.guardarCliente(cliente)) {			
				return true;
			}
			return false;
		}

	}

}
