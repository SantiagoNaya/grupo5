package Negocio;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import datos.*;

import UI.Interfaz;

public class Stock {

	public static void main(String[] args) {
		
//interfaz de ventas agregar swich;
		Interfaz i1 = new Interfaz();
		i1.Login();
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
LinkedList<Producto> Producto = new LinkedList<Producto>();
		Producto[] producto = new Producto[3];
		public boolean add(Producto productos) {
			
			char [] data = productos.getArticulo().toCharArray();
			
			
			if(data.length >= 3 && data.length <= 60 ) {
				String cantidad = productos.getCantidad();
				data = cantidad.toCharArray();
				if(data.length >= 1 && data.length <= 6 ) {
					String id_stock = productos.getId_stock();
					data = id_stock.toCharArray();
					
					if(data.length > 0) {
							
						int i = Producto.size()+1;
						producto[i] = productos;
								return true;
							}
						}
					}
					
					
			return false;
				}
			
LinkedList<Boleta> Boleta = new LinkedList<Boleta>();
		
		@Override
public String toString() {
	return "Stock [Boleta=" + Boleta + "]";
}

		public boolean add(Boleta boleta) {
	
			
			if(boleta.getCantidad().equals("0")) {
				return false;
			}else {
				Boleta.add(boleta);
				JOptionPane.showMessageDialog(null, boleta);
				return true;
			}
				
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
		
		
		public boolean Borrar(Producto productos) {
			
			if(Producto.remove(productos)) {			
				return true; 
			}else {			
				return false;
			}
		} 
		
public boolean Borrar(Boleta boleta) {
			
			if(Boleta.remove(boleta)) {			
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
		
		public boolean Editar(Producto productos){
			int index = IndexProducto(productos);
			Producto.set(index, productos);
			return true;
		}
		
		public boolean Editar(Boleta boleta){
			int index = IndexBoleta(boleta);
			Boleta.set(index, boleta);
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
		public int IndexProducto(Producto productos){
			Producto aux2 = new Producto();
			for (int i = 0; i < Producto.size(); i++) {
				System.out.println(Producto.get(i));
	           aux2=Producto.get(i);
	           String aux = aux2.getId_stock();
	           if(aux.equals(productos.getId_stock())) {
	        	   return i ;   
	           }
			}
			return 0;
		
		}
		
		public int IndexBoleta(Boleta boleta){
			Boleta aux2 = new Boleta();
			for (int i = 0; i < Boleta.size(); i++) {
				System.out.println(Boleta.get(i));
	           aux2=Boleta.get(i);
	           String aux = aux2.getId_boleta();
	           if(aux.equals(boleta.getId_boleta())) {
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

		public LinkedList<Producto> getProducto() {
			return Producto;
		}

		public void setProducto(LinkedList<Producto> productos) {
			Producto = productos;
		}

		public LinkedList<Boleta> getBoleta() {
			return Boleta;
		}

		public void setBoleta(LinkedList<Boleta> boleta) {
			Boleta = boleta;
		}
		
		
}
