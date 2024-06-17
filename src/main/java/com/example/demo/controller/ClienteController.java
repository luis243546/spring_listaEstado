package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.ClienteEntidad;
import com.example.demo.model.Clientes;

@Controller
public class ClienteController {

	Clientes objCLI =new Clientes();

	@GetMapping({"/index", "/"})
    public String index(Model model) {
        return "FormularioRegistro";
    }

    @PostMapping("/registrar")
    public String registrarCliente(@Validated ClienteEntidad cliente) {
        if(cliente!= null) {
        	objCLI.registrarCliente (cliente);
        }
        return "FormularioRegistro";
    }
    
    @GetMapping("/lista")
    public String getLista (Model model) {
    	List<ClienteEntidad> listCLI = new ArrayList<>();
    	listCLI = objCLI.getClientes();
    	model.addAttribute("ListaA", listCLI);
    	return "FormularioListaCliente";
    }
    
    @GetMapping("/ListaPorEstado")
    public String getListaPorEstado(Model model) {
        List<ClienteEntidad> listaClientes = objCLI.getClientesPorEstado();
        model.addAttribute("ListaE", listaClientes);
        return "FormularioListaEstado";
    }
    
    @GetMapping("/ListaPorUbigeo")
    public String getListaPorUbigeo(Model model) {
        List<ClienteEntidad> listaClientes = objCLI.getClientesPorUbigeo();
        model.addAttribute("ListaU", listaClientes);
        return "FormularioListaUbigeo";
    }
}
