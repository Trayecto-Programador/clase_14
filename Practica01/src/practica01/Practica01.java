/**
 * Realizar un programa que permita ingresar los nombres de 5 operarios y 
 * sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.
 */
package practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        int cantidadElementos, sueldo, indice,sueldoMaximo;
        int[] nominaSueldos;
        String[] nominaNombres;
        String nombres;
        
        
        cantidadElementos = 3;
        nominaNombres = new String[cantidadElementos];
        nominaSueldos = new int[cantidadElementos];
        indice = 0;
        
        
        
        for (int i = 0; i < cantidadElementos ; i++) {
        // Carga de Nombre de empleados
        nombres = JOptionPane.showInputDialog("Ingrese su nombre");
        // Ingreso del nombre al vector nominaNombres
        nominaNombres[i]= nombres;
        
        //Carga de Sueldo de empleado
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Sueldo"));
        //Ingreso del Sueldo al Vector
        nominaSueldos[i] = sueldo;
        }
        
        sueldoMaximo = nominaSueldos[0];
        
        for (int i = 1; i < cantidadElementos; i++) {
            System.out.println("Sueldo inicial: "+ sueldoMaximo);
            if(sueldoMaximo < nominaSueldos[i]){
                sueldoMaximo = nominaSueldos[i];
                indice = i;
            }
        }
        
        System.out.println("El empleado: "+ nominaNombres[indice]);
        System.out.println("El sueddo es: " + nominaSueldos[indice]);
        
    }
    
}
