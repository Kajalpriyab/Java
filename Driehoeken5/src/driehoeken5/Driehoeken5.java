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

/*
1.Nieuwe project aangemaakt, die een package driehoeken5 bevat en een class Driehoeken5.
2.De code van driehoeken 2 geplakt in deze project. (Mijn versie van driehoeken2 heet: OefenenDriehoekmetVraaghoogte).
3.Op driehoeken5 gaan staan, rechtermuisknop en nieuwe klasse: 'Driehoek' aangemaakt!
4.In de nieuwe klasse: 'Driehoek' heb ik de variable int hoogte aangemaakt.
5.In de nieuwe klasse heb ik een nieuwe methode aangemaakt, genaamd: 'static void geefHoogte'. En via de parameter list een waarde
van het type integer: (int nieuweHoogte) doorgegeven. Tussen de accolades de body: 'hoogte = nieuweHoogte;' ingevuld.
6.printDriehoek en de printSpaties toegevoegd als nieuwe methodes aan de klasse 'Driehoek'. En in de method het woord: static verwijdert.
7. In printDriehoek gebruikte ik: int aantalRegels, nu heb ik dat vervangen met int hoogte, en in de method tussen haakjes, de parameter leeggemaakt,
zodat ik niet twee keer int hoogte declareer.
8.Terug in dit bestand, heb ik alle codes verwijdert, behalve main, en main heb ik gevuld met de drie code om een object: 'mijnDriehoek' aan te maken.
Daarom moesten je methodes in class Driehoek niet static zijn, omdat je ze dan kan aanroepen met mijnDriehoek.
9. Nu aan mijn methods het keyword public meegegeven en aan hoogte het keyword private, nu kan je niet zomaar bij de hoogte van je driehoeken komen., maar alleen
via de methode geefHoogte. geefHoogte is nu mijn interface naar de buitenwered.
10. In class nu geschreven dat als dat als nieuwehoogte = hoogte kleiner dan of gelijk aan 10 is dat hij dan de driehoek uitprint.




/*
*/

import java.util.Scanner;

public class Driehoeken5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mijnHoogteTekst = "6";
        int mijnHoogte = Integer.parseInt(mijnHoogteTekst); //Hier zet ik een String om in een int.
   
      Driehoek mijnDriehoek = new Driehoek();
      mijnDriehoek.geefHoogte(mijnHoogte);
      mijnDriehoek.printDriehoek(); //Hiermee maak je een object: mijnDriehoek, geef je het een hoogte en druk je het af.
        
     Driehoek jouwDriehoek = new Driehoek();
     //jouwDriehoek.geefHoogte(5);
     jouwDriehoek.printDriehoek();
        
     Driehoek test = new Driehoek();
     test.geefHoogte(5);
     System.out.println(test.genereerString());
    

     
    }

}
    

