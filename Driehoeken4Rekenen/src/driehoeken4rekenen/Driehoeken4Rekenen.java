/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driehoeken4rekenen;

/**
 *
 * @author simra
 */
public class Driehoeken4Rekenen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //in de mainloop bepaal ik wat de hoogte en breedte is, die geef ik door aan een method en die method drukt een halve driehoek af.
    
  
        
        
        System.out.println("Hoe hoog moet de driehoek zijn?: "); //prompt
        
        int hoogte = (3);
        int breedte = (17);
        
       
        printHalveDriehoek(hoogte, breedte);
       }
    
    public static void printHalveDriehoek(int hoogte, int breedte){
        
        final String KRUISJE = "x";
        String tekenReeks;
        
        int aantalKruisjes; //dit moet precies zijn!
        double aantalKruisjesErbij; //double, want kan een gebroken getal zijn.
        
        aantalKruisjesErbij = (double)(breedte)/(hoogte);
        System.out.println("Aantal kruisjes erbij" + aantalKruisjesErbij);
        for (int regelNummer = 1; regelNummer<=hoogte; regelNummer++){
        
         aantalKruisjes = (int) ((regelNummer-1) * aantalKruisjesErbij)+1; //resultaat is een double, maaar aantalKruisjes moet een int zijn, daarom maak je er een int van).
         tekenReeks= "";
         
         for (int teller = 1; teller<= aantalKruisjes; teller++){
             tekenReeks = tekenReeks + KRUISJE;
             
         }
         System.out.println(tekenReeks);
         }
        
        }
    
 
    
   
        
}
  

