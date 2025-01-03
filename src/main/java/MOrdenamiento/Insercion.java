package MOrdenamiento;

import javax.swing.*;
import java.util.Scanner;

public class Insercion {
    Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int arreglo[], nElementos,nums, flag, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a ingresar: "));
        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del elemento " + i + ": "));
            arreglo[i] = nums;
        }

        for (int i = 0; i < nElementos; i++) {
            //flag es la posicion del elemento que vera
            flag = i;
            //aux es el valor del elemento de esa flag
            aux = arreglo[i];

            //Para hacer las comprobaciones del lado izquierdo
            //flag es para que inicie con el primer elemento y los demas lleguen hasta ese
            //and
            //comprobar que el numero de la izquierda es mayor al actual
            while ((flag > 0) && (arreglo[flag - 1] > aux)) {
                arreglo[flag] = arreglo[flag - 1];
                flag--;
            }

            //Para refrescar
            arreglo[flag] = aux;

        }



        System.out.println("Este arreglo esta en forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

}
