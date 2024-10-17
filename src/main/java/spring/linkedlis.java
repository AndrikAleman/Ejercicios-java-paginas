package spring;

import java.util.LinkedList;
import java.util.List;


public class linkedlis {
    /*
    LinkedList
    1-Es un tipo de clase especial y se representa como una lista enlazada
    2-Puedes duplicar, ordenar, ida y vuelta
    3-Se puede usar como lista, pila o cola
     */

    public void listasunidas() {



        List<personas> lista = new LinkedList<personas>();

        //Agregar personas al final de la lista
        lista.add(new personas(1, "Jose", 20));
        lista.add(new personas(2, "Julia", 25));
        lista.add(new personas(3, "Michael", 30));
        lista.add(new personas(4, "Richard", 35));

        //Agregar personas al principo de la lista
        lista.add(0, new personas(5, "Samuel", 40));

        System.out.println("--------------for-----------");
        //recorre por for
        for(personas persona : lista) {
            System.out.println("persona: " + persona.getNombre() + " / edad: " + persona.getEdad());
        }



    }
}
