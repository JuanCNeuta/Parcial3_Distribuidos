/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vista;

import java.util.List;
import models.Cliente;
import servicios.ClienteServices;

/**
 *
 * @author William
 */
public class Menu {

    public static void main(String[] args) {
        
        ClienteServices objAdministradorServices= new ClienteServices();
        
//        System.out.println("\nListando administradores");
//		List<Cliente> listaDeAdministradores= objAdministradorServices.listarAdministradores();
//		
//		for (Cliente administrador : listaDeAdministradores) {
//			imprimirAdministradores(administrador);
//		}
    }

    private static void imprimirAdministradores(Cliente objAdministrador) {
        System.out.println(objAdministrador.getNombres());
        System.out.println(objAdministrador.getApellidos());
        System.out.println(objAdministrador.getLogin());
        System.out.println(objAdministrador.getContrasenia());
 
    }

}
