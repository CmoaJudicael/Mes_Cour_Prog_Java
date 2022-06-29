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
public class Exo3SumNbrPremierAmélioré 
{
    static int sommeNombresPremiersQuantité(int a)
    {
        int resultat = 0,count=0, i = 2;
        
        while (count < a) 
        {            
            if (Exo1NbrPremier.estPremier(i)) 
            {                
                resultat+=i;
                count++;
            }
            i++;
            
        }        
        return resultat;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Bonjour, nous allons additionner les n premiers nombres qui sont premier\n");
        System.out.println("n : ");
        int n = DemandeNbr.NbrEntier();
        
        System.out.println("\nLa somme des nombres premiers jusqu'à n nombres premiers est de " + sommeNombresPremiersQuantité(n));
    }
}
