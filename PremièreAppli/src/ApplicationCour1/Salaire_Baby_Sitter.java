/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;

import static Ressource.DemandeNbr.NbrEntier;

/**
 *
 * @author Admin
 */
public class Salaire_Baby_Sitter {
    public static int debut, fin;
    
    public static void main(String[] args) {
        
         RecupInfo();
         System.out.println("le salaire sera de " + CalculSalaire(debut, fin) + "Euro");
         
    }
    public  static void RecupInfo()
    {        
        
         System.out.println("Veuillez indiquer l'heure de début de garde");         
        debut = NbrEntier();
         System.out.println("Veuillez indiquer l'heure de fin de garde");          
        fin = NbrEntier();
         
        if (debut > fin) 
        {            
         System.out.println("l'heure de début ne peut être supérieur à l'heure de fin");
         RecupInfo();
        }
        if (debut < 16) 
        {
            debut = 16;
        }
        if (fin > 22) 
        {
            fin = 22;
        }
        
    }
    public static int CalculSalaire(int debut, int fin)
    {
        int resultat = 0;
        if (debut < 18)
        {
            resultat += (18 - debut) * 10;
            resultat += (fin - 18) * 12;
        }
         if (debut > 18)
        {
            resultat += (fin - debut) * 12;
        }       
        
        return resultat;
    }
    
}
