package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClienteDTO {
    
    private String nombres;		
	private String apellidos;	
	private String correo;	
	private String telefono;	
	private String login;
    private String contrasenia; 

    public ClienteDTO(){

    }

}
