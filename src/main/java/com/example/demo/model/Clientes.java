package com.example.demo.model;
import java.util.ArrayList;
import com.example.demo.Entity.ClienteEntidad;

public class Clientes {
	ArrayList<ClienteEntidad> listaCLI = new ArrayList<>();
	
	public void registrarCliente (ClienteEntidad objAE) {
		listaCLI.add(objAE);
	}
	
	public ArrayList<ClienteEntidad> getClientes(){
		return listaCLI;
	}
	
	public ArrayList<ClienteEntidad> getClientesPorEstado(){
		ArrayList<ClienteEntidad> clientePorEstado = new ArrayList<>();
		for(ClienteEntidad ae:listaCLI) {
			if(ae.getEstadoCivil().equals("Casado")) {
				clientePorEstado.add(ae);
			}
		}
		
		return clientePorEstado;
	}
	
	public ArrayList<ClienteEntidad> getClientesPorUbigeo(){
		ArrayList<ClienteEntidad> clientePorUbigeo = new ArrayList<>();
		for(ClienteEntidad ae:listaCLI) {
			if(ae.getCodigoPostal().equals("05000")) {
				clientePorUbigeo.add(ae);
			}
		}
		
		return clientePorUbigeo;
	}
}
