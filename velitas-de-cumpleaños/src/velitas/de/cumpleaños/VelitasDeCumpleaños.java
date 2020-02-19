/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velitas.de.cumpleaños;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class VelitasDeCumpleaños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entradateclado=new Scanner(System.in);
    int[] alturaVelita= new int[500];
    int velicantidad, contadorregularr,alturamaxima=0,velitasencendidas=0;
    System.out.println("cuantos años cumple ?");
    velicantidad=Integer.parseInt(entradateclado.nextLine());
    for(int contadorregular=0;contadorregular<velicantidad;contadorregular++){
    contadorregularr=contadorregular+1;
    System.out.print("cual es la altura de la vela "+contadorregularr+"= ");
    alturaVelita[contadorregular]=Integer.parseInt(entradateclado.nextLine());
    }
    for(int contadorregular=0;contadorregular<velicantidad;contadorregular++){
        for(int contadorjr=0;contadorjr<velicantidad;contadorjr++){
            if(alturaVelita[contadorregular]<alturaVelita[contadorjr])
            {
                alturamaxima=alturaVelita[contadorjr];
            }
            else
            {
                if(alturaVelita[contadorregular]>alturaVelita[contadorjr]){
                    alturamaxima=alturaVelita[contadorregular];
                }
            }
        }
    }
    System.out.println("Altura maxima= "+alturamaxima);
    for(int contadorregular=0;contadorregular<velicantidad;contadorregular++){
       if(alturamaxima==alturaVelita[contadorregular]) {
           velitasencendidas++;
       }
    }
    System.out.println("Numero de velitas encendidas= "+velitasencendidas);
    }
    
}
 