/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21arz_6;

import java.util.ArrayList;

/**
 *
 * @author ABITA
 */
public class G4s21arz_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista =new ArrayList<String>();
        lista.add("Fernando");
        lista.add("Monica");
        lista.add("Araceli");
        lista.add("Federico");
        lista.add("Armando");
        
        for (int i=0; i<lista.size();i++){
            System.out.println("valor en posicion ["+i+"]=" + lista.get(i));
        }
        int a=0;
        for(String cadena: lista){
            System.out.println("valor de la lista en posicion[" + a + "] ="+ cadena);
            a++;
        }
               lista.forEach(cadena ->{
                   System.out.println("valor de la lista " + cadena);
               });
               lista.stream().forEach(cadena ->{
                   System.out.println("valor de la lista  por media de stream " + cadena);
               });
               } 
    }
    

