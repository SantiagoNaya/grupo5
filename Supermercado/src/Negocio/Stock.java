package Negocio;

import java.util.LinkedList;


import datos.*;

import UI.Interfaz;

public class Stock {

	public static void main(String[] args) {
		
		Interfaz i1 = new Interfaz();
	}
		LinkedList<Sucursal> Sucursal = new LinkedList<Sucursal>();
		
		public boolean add(Sucursal sucursal) {
			char [] data = sucursal.getNombre().toCharArray();
			
			if(data.length >= 3 && data.length <= 60 ) {
				String password = sucursal.getPassword();
				data = password.toCharArray();
				if(data.length >= 3 && data.length <= 60 ) {
					String dni = sucursal.getDni();
					data = dni.toCharArray();
					if(data.length == 8 ) {
						String id_sucursal = sucursal.getId_sucursal();
						data = id_sucursal.toCharArray();
					if(data.length >= 0) {
							String nombre_sucursal = sucursal.getNombre_sucursal();
							data = id_sucursal.toCharArray();
							if(data.length >= 3 && data.length <= 60  ) {
								Sucursal.add(sucursal);
								return true;
							}
						}
					}
					
					
					
				}
			}
			return false;
		
}
LinkedList<Sectorventa> SectorVenta = new LinkedList<Sectorventa>();
		
		public boolean add(Sectorventa Sectorventa) {
			char [] data = Sectorventa.getNombre().toCharArray();
			
			
			if(data.length >= 3 && data.length <= 60 ) {
				String password = Sectorventa.getPassword();
				data = password.toCharArray();
				if(data.length >= 3 && data.length <= 60 ) {
					String dni = Sectorventa.getDni();
					data = dni.toCharArray();
					if(data.length == 8 ) {
						String id_venta = Sectorventa.getId_venta();
						data = id_venta.toCharArray();
					if(data.length >= 0) {
							
								SectorVenta.add(Sectorventa);
								return true;
							}
						}
					}
					
					
					
				}
			
			return false;
		
}
LinkedList<Operario> Operarios = new LinkedList<Operario>();
		
		public boolean add(Operario operarios) {
			char [] data = operarios.getNombre().toCharArray();
			
			
			if(data.length >= 3 && data.length <= 60 ) {
				String password = operarios.getPassword();
				data = password.toCharArray();
				if(data.length >= 3 && data.length <= 60 ) {
					String dni = operarios.getDni();
					data = dni.toCharArray();
					if(data.length == 8 ) {
						String id_operario = operarios.getId_operario();
						data = id_operario.toCharArray();
					if(data.length >= 0) {
							
						Operarios.add(operarios);
								return true;
							}
						}
					}
					
					
					
				}
			
			return false;
		
}
LinkedList<Gerente> Gerente = new LinkedList<Gerente>();
		
		public boolean add(Gerente gerente) {
			char [] data = gerente.getNombre().toCharArray();
			
			
			if(data.length >= 3 && data.length <= 60 ) {
				String password = gerente.getPassword();
				data = password.toCharArray();
				if(data.length >= 3 && data.length <= 60 ) {
					String dni = gerente.getDni();
					data = dni.toCharArray();
					if(data.length == 8 ) {
						String id_gerente = gerente.getId_gerente();
						data = id_gerente.toCharArray();
					if(data.length >= 0) {
							
						Gerente.add(gerente);
								return true;
							}
						}
					}
					
					
					
				}
			
			return false;
		
}
		
		public boolean Borrar(Sucursal sucursal) {
			
			if(Sucursal.remove(sucursal)) {			
				return true; 
			}else {			
				return false;
			}
	}
		public boolean Borrar(Sectorventa Sectorventa) {
			
			if(SectorVenta.remove(Sectorventa)) {			
				return true; 
			}else {			
				return false;
			}
	}
		public boolean Borrar(Operario operarios) {
	
	if(Operarios.remove(operarios)) {			
		return true; 
	}else {			
		return false;
	}

}
		public boolean Borrar(Gerente gerente) {
	
	if(Gerente.remove(gerente)) {			
		return true; 
	}else {			
		return false;
	}
}
		public boolean Editar(Sucursal sucursal){
			int index = IndexSucursal(sucursal);
			Sucursal.set(index, sucursal);
			return true;
		}
		public boolean Editar(Sectorventa Sectorventa){
			int index = IndexVenta(Sectorventa);
			SectorVenta.set(index, Sectorventa);
			return true;
		}
		public boolean Editar(Operario operarios){
			int index = IndexOperario(operarios);
			Operarios.set(index, operarios);
			return true;
		}
		public boolean Editar(Gerente gerente){
			int index = IndexGerente(gerente);
			Gerente.set(index, gerente);
			return true;
		}
		
		public int IndexSucursal(Sucursal sucursal){
			Sucursal aux2 = new Sucursal();
			for (int i = 0; i < Sucursal.size(); i++) {
				System.out.println(Sucursal.get(i));
	           aux2=Sucursal.get(i);
	           String aux = aux2.getDni();
	           if(aux.equals(sucursal.getDni())) {
	        	   return i ;   
	           }
			}
			return 0;
		
		}
		
		
		public int IndexVenta(Sectorventa Sectorventa){
			Sectorventa aux2 = new Sectorventa();
			for (int i = 0; i < SectorVenta.size(); i++) {
				System.out.println(SectorVenta.get(i));
	           aux2=SectorVenta.get(i);
	           String aux = aux2.getDni();
	           if(aux.equals(Sectorventa.getDni())) {
	        	   return i ;   
	           }
			}
			return 0;
		
		}
		public int IndexOperario(Operario operarios){
			Operario aux2 = new Operario();
			for (int i = 0; i < Operarios.size(); i++) {
				System.out.println(Operarios.get(i));
	           aux2=Operarios.get(i);
	           String aux = aux2.getDni();
	           if(aux.equals(operarios.getDni())) {
	        	   return i ;   
	           }
			}
			return 0;
		
		}
		public int IndexGerente(Gerente gerente){
			Gerente aux2 = new Gerente();
			for (int i = 0; i < Gerente.size(); i++) {
				System.out.println(Gerente.get(i));
	           aux2=Gerente.get(i);
	           String aux = aux2.getDni();
	           if(aux.equals(gerente.getDni())) {
	        	   return i ;   
	           }
			}
			return 0;
		
		}
		
		public LinkedList<Sucursal> getSucursal() {
			return Sucursal;
		}

		public void setSucursal(LinkedList<Sucursal> sucursal) {
			Sucursal = sucursal;
		}
		public LinkedList<Sectorventa> getVenta() {
			return SectorVenta;
		}

		public void setVenta(LinkedList<Sectorventa> Sectorventa) {
			SectorVenta = Sectorventa;
		}
		public LinkedList<Operario> getOperario() {
			return Operarios;
		}

		public void setOperario(LinkedList<Operario> operarios) {
			Operarios = operarios;
		}
		public LinkedList<Gerente> getGerente() {
			return Gerente;
		}

		public void setGerente(LinkedList<Gerente> gerente) {
			Gerente = gerente;
		}

		
		
		
}
