/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Cliente;

/**
 *
 * @author William
 */
public class ClienteServices {

    private String endPoint;
    private Client objClientePeticiones;

    public ClienteServices() {
        this.endPoint = "http://localhost:5000/api/clientes";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Cliente consultarClienteByInicioSesion(String login, String contrasenia) {
        Cliente objCliente = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint + "/" + login + "/" + contrasenia);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objCliente = objPeticion.get(Cliente.class);

        return objCliente;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> listaClientes = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaClientes = objPeticion.get(new GenericType<List<Cliente>>() {
        });

        return listaClientes;
    }

    public Cliente registrarCliente(Cliente objClienteRegistar) {
        Cliente objCliente = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Entity<Cliente> data = Entity.entity(objClienteRegistar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objCliente = objPeticion.post(data, Cliente.class);

        return objCliente;
    }

}