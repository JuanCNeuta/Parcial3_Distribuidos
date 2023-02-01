package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@Autowired
	private IProductoService productoService;

	//Servicio 3
	@PostMapping("/administrador/productos")
	public ProductoDTO createAdmin(@RequestBody ProductoDTO producto) {
		ProductoDTO objProducto2 = null;
		objProducto2 = productoService.save(producto);
		return objProducto2;
	}

	// Servicio 4
	@GetMapping("/administrador/productos")
	public List<ProductoDTO> indexOfert() {
		return productoService.findAllOfert();
	}

	// Servicio 5
	@PutMapping("/administrador/productos/{codigo}/{estado}")
	public ProductoDTO updateOfet(@PathVariable Integer codigo,@PathVariable String estado) {
		ProductoDTO objProducto = null;
		ProductoDTO ProductoActual = productoService.findById(codigo);
		if (ProductoActual != null) {
			ProductoActual.setEstado(estado);
			objProducto = productoService.update(codigo, ProductoActual);
		}
		return objProducto;
	}

	// Servicio 6
	@GetMapping("/cliente/productos")
	public List<ProductoDTO> index() {
		return productoService.findAll();
	}

	//Servicio 7
	@GetMapping("/cliente/productos/{codigo}")
	public ProductoDTO show(@PathVariable Integer codigo) {
		ProductoDTO objProducto = null;
		objProducto = productoService.findById(codigo);
		return objProducto;
	}

	// Servicio 8
	@GetMapping("/cliente/productoEnSubasta")
	public ProductoDTO showSubasta() {
		ProductoDTO objProducto = null;
		objProducto = productoService.findEnSubasta();
		return objProducto;
	}

	//Servicio 9
	@PutMapping("/cliente/hacerOferta/{valor}")
	public ProductoDTO ofrecer(@PathVariable Number valor) {
		ProductoDTO ProductoActual = null;
		ProductoDTO objProducto = null;
		ProductoActual = productoService.findEnSubasta();
		if (ProductoActual != null) {
			int codigo=ProductoActual.getCodigo();
			ProductoActual.setValor(valor);
			objProducto = productoService.update(codigo, ProductoActual);
		}
		return objProducto;
	}

	

	

	

	@PostMapping("/productos")
	public ProductoDTO create(@RequestBody ProductoDTO producto) {
		ProductoDTO objProducto = null;
		objProducto = productoService.save(producto);
		return objProducto;
	}

	
	@DeleteMapping("/productos")
	public Boolean delete(@RequestParam Integer codigo) {
		Boolean bandera = false;
		ProductoDTO ProductoActual = productoService.findById(codigo);
		if (ProductoActual != null) {
			bandera = productoService.delete(codigo);
		}
		return bandera;

	}

}