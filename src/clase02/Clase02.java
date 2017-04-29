/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;


public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Perez", 30);
        Persona p2 = new Persona("Ramiro", "Margeli", 24);
        Estudiante e1 = new Estudiante("Lucas", "Mauro", 21, "11123");
        System.out.println(p.getNombre());
        System.out.println(p2.getNombre());
        System.out.println(e1.getNombre());
      
        p.setEdad(40);
        
        Persona p1 = new Estudiante("Pablo", "Gomez", 40, "2222");
        Estudiante e2 = (Estudiante) p1;
        e1.hablar();
        p1.hablar();
        
        if(e1.equals(e2)){
            System.out.println("Son iguales.");
        }
        else
            System.out.println("Son distintos");
        
    }
    
}
