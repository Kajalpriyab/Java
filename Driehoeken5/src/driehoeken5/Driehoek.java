/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driehoeken5;

/**
 *
 * @author simra
 */
public class Driehoek {
    
   private int hoogte; //globale varabele
   
   static int MAXIMALE_HOOGTE = 10; //Static geeft aan dat deze variabele geldig is voor alle driehoeken.
   //static final MAXIMALE_HOOGTE; 
   static  char ENTER = '\\';        
    public void geefHoogte (int nieuweHoogte){
          
       MAXIMALE_HOOGTE = nieuweHoogte;
        
        if (nieuweHoogte > 0 && nieuweHoogte <=MAXIMALE_HOOGTE){
           hoogte = nieuweHoogte;
           System.out.println(hoogte);
        
        }
  
    }
    public void printDriehoek(){
                 
            String tekenX = "x";
            String driehoek = tekenX;
            
            int spatieTeller = hoogte - 1;
            for (int rij = 1; rij <=hoogte ; rij++) {   //Alles wat tussen {} zit, na de loop-instructie, zit in de loop
                printSpaties(spatieTeller);
                System.out.println(driehoek);
                driehoek = driehoek + tekenX + tekenX;
                spatieTeller --;
            //Alles onder de loop, omdat het allemaal in een loop moet komen.           
            
            }
  
    }
    
     public String genereerString(){
                 
            String tekenX = "x";
            String driehoek = tekenX;
            
            int spatieTeller = hoogte - 1;
            for (int rij = 1; rij <=hoogte ; rij++) {   //Alles wat tussen {} zit, na de loop-instructie, zit in de loop
                printSpaties(spatieTeller);
                System.out.println(driehoek);
                driehoek = driehoek + tekenX + tekenX;
                spatieTeller --;
            //Alles onder de loop, omdat het allemaal in een loop moet komen.  
            }
            
            return null;
  
    }
    
    
    
    
    public void printSpaties (int aantalRegels){
        
         String spatie = " ";
         String spaties = spatie;
         
       
         for (int rij= 1; rij <=aantalRegels; rij++){
         System.out.print(spaties);
        
         }
  
    }
    
    public String genereerStringOud() {
        final String KRUISJE = "X";
        final String SPATIE = " ";
        //static final char ENTER = '\';
        String tekenReeks = "";
        int aantalSpaties;
        int aantalKruisjes;       

        for (int regelNummer = 1; regelNummer <= hoogte; regelNummer++){
            //tekenReeks = ""; // begin elke regel met een LEGE tekenreeks!
            
            aantalSpaties = hoogte - regelNummer; // elke regel een spatie minder
            for (int teller = 1; teller <= aantalSpaties; teller++){
                tekenReeks =  SPATIE + tekenReeks +  KRUISJE +System.lineSeparator(); // voeg de spatie toe aan de voorkant
            }
            
            aantalKruisjes = 2 * regelNummer - 1; // zo krijg je 1-3-5-... kruisjes!
            for (int teller = 1; teller <= aantalKruisjes; teller++){
                tekenReeks =  tekenReeks ; // voeg de kruisjes toe aan de achterkant
            }
          
            //return tekenReeks;
        }
       return tekenReeks;
     
    }
}