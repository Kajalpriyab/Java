/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driehoekprogramma;

/**
 *
 * @author simra
 */
public class Driehoekprogramma {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int hoogte = (3);
       
       System.out.println("Start of the program:");
       printDriehoek (hoogte);
       System.out.println("End of the program:");
    }
  
    
    public static void printDriehoek (int aantalRegels){
           
        for (int regelNummer = 1; regelNummer<= aantalRegels; regelNummer++)
      
        System.out.println("regel:" + regelNummer);
        
        String tekenReeks;
        for (int aantalKruisjes; aantalKruisjes<= aantalRegels; aantalKruisjes++)
        
    
    }
}
