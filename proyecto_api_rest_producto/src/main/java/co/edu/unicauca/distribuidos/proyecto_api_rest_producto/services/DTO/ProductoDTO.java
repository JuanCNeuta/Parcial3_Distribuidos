package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ProductoDTO {
    private Integer codigo;		
	private String nombre;	
	private String estado;	
	private Number valor;

    public ProductoDTO()
    {

    } 
}
