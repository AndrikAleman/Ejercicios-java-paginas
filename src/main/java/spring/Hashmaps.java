package spring;

import javax.swing.text.StyleConstants;
import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    //Map --> Coleccion de pared clave-valor
    //no puede haber claves duplicadas
    //permite accesos rapidos a valores a traves de claves
    //Tipo
    //  HashMap, TreeMap, LinkedHashMap, more...

    /*
    Tiene varios metodos:
        put (C calve, V valor) agregar clave-valor a la collection
        get (Object clave) Devuelve el valor de valor que tiene esa clave
        containsKey(Object clave) Verifica si existe la clave especificada en el map
        containsValue(Object clave) Comprueba si el map contiene el valor especificado
        remove(object clave) Eelimina el registro con esa clave
        keyset() devuelve un conjunto de todas las claes en el Map
        values() devuelve una coleccion de todos los valores que contiene el Map
     */

    //Declara e importa
    public void mapas() {
        Map<Integer, String> Empleados = new HashMap<Integer, String>();

        Empleados.put(1234,"Alexis Tridente");
        Empleados.put(1235,"Mike Dos");
        Empleados.put(1236,"Kevlen Gpt");

        //Para buscar
        /*boolean siono = Empleados.containsValue("Alexis Trident");
        boolean siono = Empleados.containsKey(1234);

        if(siono == true)
        {
            System.out.println("El empleado si se encuentra");
        }
        else
        {
            System.out.println("El empleado no se encuentra");
        }*/

        /* Para que me de todo el map como un array
        System.out.println(Empleados.values());
        System.out.println(Empleados.keyset());
        */

        //Traer el valor de un key
        String nombre = Empleados.get(1234);
        System.out.println("El empleado es: " + nombre);
    }
}
