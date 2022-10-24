package Negocio;


import java.util.LinkedList;

import datos.*;
import UI.*;

public class ListadoUsuario {

	public static void main(String[] args) {
		
		Interfaz i1 = new Interfaz();
		i1.Login();
		
	}
		
	LinkedList<Adminventas> admin = new LinkedList<Adminventas>();
		
		public boolean add(Adminventas adminventas) {
			
			
			
			if(adminventas.guardarAdminventa(adminventas)) {
				
				admin.add(adminventas);
				
				return true;
			}
			return false;
		}

		
		
	


LinkedList<Operario> operario = new LinkedList<Operario>();

public boolean add(Operario operarios) {
	
	
	
	if(operarios.guardarOperario(operarios)) {
		
		operario.add(operarios);
		
		return true;
	}
	return false;
}



}

