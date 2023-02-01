/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vista;

import java.util.List;
import models.Administrador;
import servicios.AdministradorServices;

/**
 *
 * @author William
 */
public class Menu {

    public static void main(String[] args) {
        
        AdministradorServices objAdministradorServices= new AdministradorServices();
        
        System.out.println("\nListando administradores");
		List<Administrador> listaDeAdministradores= objAdministradorServices.listarAdministradores();
		
		for (Administrador administrador : listaDeAdministradores) {
			imprimirAdministradores(administrador);
		}
    }

    private static void imprimirAdministradores(Administrador objAdministrador) {
        System.out.println(objAdministrador.getNombres());
        System.out.println(objAdministrador.getApellidos());
        System.out.println(objAdministrador.getLogin());
        System.out.println(objAdministrador.getContrasenia());
 
    }

}
