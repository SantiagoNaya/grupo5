package Negocio;


import java.util.LinkedList;

import datos.*;
import UI.*;

public class ListadoUsuario {

	public static void main(String[] args) {
		
		Interfaz i1 = new Interfaz();
		i1.Login();
		
	}
		

	
	
public boolean add(Adminventas adminventas) {
			
			Adminventas admin = new Adminventas();
			char [] data = adminventas.getNombre().toCharArray();
					
			if(data.length >= 3 && data.length <= 30 ) {
				String password = adminventas.getPassword();
				data = password.toCharArray();
				if(data.length >= 3 && data.length <= 30) {
					String dni = adminventas.getDni();
					data = dni.toCharArray();				
					if(data.length == 8) {					
						admin.guardarAdminventa(adminventas);
						}						
							}
						}
													
			return false;
			
		}

public boolean add(Operario operarios) {
	
	
	Operario operario = new Operario();
	char [] data = operarios.getNombre().toCharArray();
			
	if(data.length >= 3 && data.length <= 30 ) {
		String password = operarios.getPassword();
		data = password.toCharArray();
		if(data.length >= 3 && data.length <= 30) {
			String dni = operarios.getDni();
			data = dni.toCharArray();				
			if(data.length == 8) {					
				operario.guardarOperario(operarios);
				}						
					}
				}
											
	return false;
	
}

public boolean add(Gerente gerentes) {
	
	Gerente gerente = new Gerente();
	
	char [] data = gerentes.getNombre().toCharArray();
			
	if(data.length >= 3 && data.length <= 30 ) {
		String password = gerentes.getPassword();
		data = password.toCharArray();
		if(data.length >= 3 && data.length <= 30) {
			String dni = gerentes.getDni();
			data = dni.toCharArray();				
			if(data.length == 8) {					
				gerente.guardarGerente(gerentes);
				}						
					}
				}
											
	return false;
	
	
}
}

