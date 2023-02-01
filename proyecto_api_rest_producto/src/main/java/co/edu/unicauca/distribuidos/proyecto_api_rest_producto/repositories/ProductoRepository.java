package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models.ProductoEntity;

@Repository
public class ProductoRepository {
    private ArrayList<ProductoEntity> listaDeProductos;
	private ArrayList<ProductoEntity> listaDeProductosEnOferta;
	
	public ProductoRepository()
	{
		this.listaDeProductos= new ArrayList<ProductoEntity>();
		this.listaDeProductosEnOferta= new ArrayList<ProductoEntity>();
		cargarProductoes();
	}
	
   public List<ProductoEntity> findAll()
   {
	   System.out.println("Invocando a listar Productos");
	   return this.listaDeProductos;	
   }

   public ProductoEntity findEnSubasta()
   {
	   System.out.println("Invocando a consultar Producto en Subasta");
	   ProductoEntity objProducto=null;
	   for (ProductoEntity producto : listaDeProductos) {
			if(producto.getEstado().equals("En subasta")){
				objProducto=producto;
				break;
			}else{
				objProducto=null;
			}
	   }
	   return objProducto;
   }

   public List<ProductoEntity> findAllOfert()
   {
	   System.out.println("Invocando a listar Productos en oferta");
	   for(ProductoEntity listaDeProduct: listaDeProductos){
			if(listaDeProduct.getEstado().equals("En oferta")){
				listaDeProductosEnOferta.add(listaDeProduct);
			}
	   }
	   return this.listaDeProductosEnOferta;	
   }
	
   public ProductoEntity findById(Integer codigo)
   {
	   System.out.println("Invocando a consultar un Producto");
       ProductoEntity objProducto=null;
		
		for (ProductoEntity producto : listaDeProductos) {
			if(producto.getCodigo()==codigo)
			{
				objProducto=producto;
				break;
			}
		}
		
		return objProducto;
	}
	
	public ProductoEntity save(ProductoEntity producto)	
	{
		 System.out.println("Invocando a almacenar Producto");
		 ProductoEntity objProducto=null;
		 if (this.listaDeProductos.add(producto))
		 {
            objProducto=producto;
		 }
		 
		 return objProducto;
	}
	
	public ProductoEntity update(Integer codigo, ProductoEntity producto)
	{
		 System.out.println("Invocando a actualizar un Producto");
		 ProductoEntity objProducto=null;
		 
		 for (int i = 0; i < this.listaDeProductos.size(); i++) {
			if(this.listaDeProductos.get(i).getCodigo()==codigo)
			{				
				this.listaDeProductos.set(i,producto);
				objProducto=producto;
				break;
			}
		}
		 
		 return objProducto;
	}
	
	
	public boolean delete(Integer codigo)
	{
		System.out.println("Invocando a eliminar un Producto");
		boolean bandera=false;
		 
		 for (int i = 0; i < this.listaDeProductos.size(); i++) {
			if(this.listaDeProductos.get(i).getCodigo()==codigo)
			{
				this.listaDeProductos.remove(i);
				bandera=true;
				break;
			}
		}
		 
		 return bandera;
	}
	
	private void cargarProductoes()
	{
		ProductoEntity objProducto1= new ProductoEntity(1, "Cama", "En oferta", 800000);
		this.listaDeProductos.add(objProducto1);
		ProductoEntity objProducto2= new ProductoEntity(2, "Espejo", "Vendido", 120000);
		this.listaDeProductos.add(objProducto2);
		ProductoEntity objProducto3= new ProductoEntity(3, "Silla", "En oferta", 600000);
		this.listaDeProductos.add(objProducto3);
		ProductoEntity objProducto= new ProductoEntity(4, "Tv 50 pulg", "En subasta", 1800000);
		this.listaDeProductos.add(objProducto);
	}
}
