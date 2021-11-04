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
public class Exo2SumNbrPermier 
{
    public static int sommeNombresPremiersInf(int a)
    {
        int resultat=0;
        for (int i = 2; i <=a; i++) 
        {
            
            if (Exo1NbrPremier.estPremier(i)) 
            {
                resultat+=i;
            }
        }
        return resultat;
    }
    
    public static void main(String[] args) {
        System.out.println("Bonjour, nous allons additionner les nombres premiers jusqu'à une certaine valeur n\n");
        System.out.print("n : ");
        int n = DemandeNbr.NbrEntier();
        System.out.println("\nLa somme des nombres jusqu'à n est de " + sommeNombresPremiersInf(n));
    }
}
