/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicioextra8;

import java.util.Scanner;

public class EjercicioExtra8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int pares = 0;
        int impares = 0;
        int numeros;
        
        do{
            System.out.print("Ingresa numeros enteros: ");
            numeros = entrada.nextInt();
            contador++;
            
            if(numeros % 2 == 0){
                pares++;
            }else{
                impares ++;
            }
        }while(numeros % 5 != 0);
        
        System.out.println("La cantidad de números leídos es de: "+(contador-1)); // -1 para que no me cuente el numero que es multiplo de 5. Porque la unica funcion del numero multiplo de 5 es de cortar el bucle
        System.out.println("Números pares ingresados: "+pares);
        System.out.println("Números impares ingresados: "+impares);
    }
    
}
