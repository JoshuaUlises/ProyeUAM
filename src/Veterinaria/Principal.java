/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

import java.util.ArrayList;

/**
 *
 * // la clase ayuda a crear objetos , definir acciones y comportamientos
 *
 * @author Joshua
 */
public class Principal {

    public static void main(String[] args) {  //objeto creado
        Cliente cliente1 = new Cliente("111111111", "Ronaldo", "777777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.50, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);

        mascota1.mostrarResumen();
        System.out.println("Dueno: " + mascota1.getDuenio().getNombre());
        System.out.println("============");
        mascota2.mostrarResumen();

        cliente1.setIdentificacion("22222222222");
        System.out.println("Dueno: " + mascota1.getDuenio().getIdentificacion());

        Veterinario veterinario1 = new Veterinario("V001", "Medicina General", "Dra Shirley Cruz");

        Consulta consulta1 = new Consulta(
                "5/10/2026",
                "Control General",
                mascota1,
                15000,
                veterinario1);
        consulta1.mostrarResumen();
        System.out.println("============");
        consulta1.actualizarCosto(17500);
        consulta1.mostrarResumen();
        System.out.println("============");
        consulta1.actualizarCosto(18000, "Control y medicamento");
        consulta1.mostrarResumen();

        Cliente cliente2 = new Cliente("222222222", "Carlos Mora", "8888888");
        Persona personaReferencia = cliente2;

        System.out.println(cliente2.getNombre());
        System.out.println(personaReferencia.getNombre());

        System.out.println("=====RESUMIBLES======="); // polimorfismo
        Resumible r1 = cliente1;
        Resumible r2 = mascota1;
        Resumible r3 = consulta1;

        r1.mostrarResumen();
        r2.mostrarResumen();
        r3.mostrarResumen();

        System.out.println("=====ARRAY LIST MASCOTAS=======");
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>(); //array list no tiene limites
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(new Mascota("Luffy", "perro", 1, 1));  // creamos una nueva mascota en la lista de arreglo

        if (!mascotas.isEmpty()) { // el signo ! es una negacion niega el if
            System.out.println("=====Primera=======");
            Mascota primera = mascotas.get(0);
            primera.mostrarResumen();
        }

        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).mostrarResumen();
        }

        System.out.println("=====Primera=======");
        Mascota[] mascotas1 = new Mascota[3]; //array tiene limites
        mascotas1[2] = mascota2;
        mascotas1[1] = mascota1;
        mascotas1[0] = new Mascota("Luffy", "perro", 1, 1);
        if (mascotas1.length > 0) { // el signo ! es una negacion niega el if
            System.out.println("=====Primera=======");
            Mascota primera = mascotas1[0];
            primera.mostrarResumen();
        }
        System.out.println("====Recorre Array=======");
        for (int i = 0; i < mascotas1.length; i++) {
            mascotas1[i].mostrarResumen();
        }
        
        System.out.println("====Recorre Array List de Consultas=======");
        ArrayList<Consulta> consultas = new ArrayList<Consulta>();
        consultas.add(consulta1);
        consultas.add(new Consulta ("12/10/2026","Vacunas", mascota2, 10000, veterinario1));
        
        for (int i = 0; i < consultas.size(); i++) {
            consultas.get(i).mostrarResumen();
          
        }
        System.out.println("====Recorre Array List de Resumibles=======");
        ArrayList<Resumible> resumibles = new ArrayList<Resumible>(); // array list con polimorfismo
        resumibles.add(cliente2);
        resumibles.add(veterinario1);
        resumibles.add(mascota2);
        resumibles.add(consulta1);
        
        for (int i = 0; i < resumibles.size(); i++) {
            resumibles.get(i).mostrarResumen();
            System.out.println("=============");
        }
        
    }
}
