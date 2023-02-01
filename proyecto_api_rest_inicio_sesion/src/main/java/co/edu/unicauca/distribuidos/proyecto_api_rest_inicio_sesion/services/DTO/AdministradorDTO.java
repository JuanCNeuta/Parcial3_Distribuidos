package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdministradorDTO {
    
    private String nombres;		
	private String apellidos;		
	private String login;
    private String contrasenia; 

    public AdministradorDTO(){
        
    }
}
