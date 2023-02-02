/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import models.Administrador;
import models.Producto;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author William
 */
public class ProductoServices {
    
    private String endPoint;
    private Client objClientePeticiones;

    public ProductoServices() {
        this.endPoint = "http://localhost:6000/api/administrador/productos";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }
    
    
    //Registrar producto
    public Producto registrarProducto(Producto objProductoRegistar) {
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Entity<Producto> data = Entity.entity(objProductoRegistar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.post(data, Producto.class);

        return objProducto;
    }

}
