package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services;

import java.util.List;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductoDTO;

public interface IProductoService {
    public List<ProductoDTO> findAll();		
	public List<ProductoDTO> findAllOfert();
	public ProductoDTO findById(Integer codigo);	
	public ProductoDTO save(ProductoDTO producto);	
	public ProductoDTO update(Integer codigo, ProductoDTO producto);	
	public boolean delete(Integer codigo);	
}
