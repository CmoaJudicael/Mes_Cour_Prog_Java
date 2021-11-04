/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCours4;
import Ressource.DemandeNbr;
/**
 *
 * @author Admin
 */
public class Exo1NbrPremier {
    
    public static boolean estPremier(int a)
    {
        boolean resultat= true;
        if (a == 1) 
        {
            resultat=false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) 
        {
            if (a%i == 0) 
            {
                resultat = false;
            }
        }   
        
        return resultat;
    }
    public static void main(String[] args) {
        System.out.println("Bonjour, nous allons tester si un nombre est premier\n");
        int NbrATester = DemandeNbr.NbrEntier();
        
        if (estPremier(NbrATester)) 
        {
            System.out.println(NbrATester + " est un nombre premier");            
        }
        else
        {
            System.out.println(NbrATester + " n'est pas un nombre premier");            
        }
        
    }
}
