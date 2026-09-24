/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

/**
 *
 * // la clase ayuda a crear objetos , definir acciones y comportamientos 
 * @author Joshua
 */
public class Principal {
    public static void main(String [] args) {  //objeto creado
        Cliente cliente1 = new Cliente("111111111", "Ronaldo", "777777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 5.25,cliente1); 
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);
        
        mascota1.mostrarResumen();
        System.out.println("Dueno: " + mascota1.getDuenio().getNombre());
        System.out.println("========");
        mascota2.mostrarResumen();
        
        cliente1.setIdentification("22222222222");
        System.out.println("Dueno: " + mascota1.getDuenio().getIdentification());
    }
}
