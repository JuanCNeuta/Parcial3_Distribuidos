package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdministradorDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClienteDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services.ISesionService;

@RestController
@RequestMapping("/api")
public class SesionRestController {
    
    @Autowired
    private ISesionService sesionService;

    //CRUD SERVICIOS Administradores
    @GetMapping("/administradores")
    public List<AdministradorDTO> indexA(){
        return sesionService.findAllA();
    }

    //Consulta para inicio de sesion administrador
    @GetMapping("/administradores/{login}/{contrasenia}")
	public AdministradorDTO sesion1(@PathVariable String login,@PathVariable String contrasenia) {
		AdministradorDTO objAdministrador = null;		
		objAdministrador = sesionService.findAdminBySesion(login,contrasenia);		
		return objAdministrador;
	}

    //Registrar nuevo administrador
    @PostMapping("/administradores")
	public AdministradorDTO createA(@RequestBody AdministradorDTO administrador) {	
		AdministradorDTO objAdministrador = null;
		objAdministrador =  sesionService.saveA(administrador);
		return objAdministrador;
	}

    //CRUD SERVICIOS Clientes
    @GetMapping("/clientes")
    public List<ClienteDTO> indexC(){
        return sesionService.findAllC();
    }

    //Consulta para inicio de sesion cliente
    @GetMapping("/clientes/{login}/{contrasenia}")
	public ClienteDTO sesion2(@PathVariable String login,@PathVariable String contrasenia) {
		ClienteDTO objCliente = null;		
		objCliente = sesionService.findClientBySesion(login,contrasenia);		
		return objCliente;
	}

    //Registrar nuevo cliente
    @PostMapping("/clientes")
	public ClienteDTO createC(@RequestBody ClienteDTO cliente) {	
		ClienteDTO objCliente = null;
		objCliente =  sesionService.saveC(cliente);
		return objCliente;
	}


}
