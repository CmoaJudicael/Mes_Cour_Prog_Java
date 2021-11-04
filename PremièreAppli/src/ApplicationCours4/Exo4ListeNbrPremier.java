/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCours4;

import Ressource.DemandeNbr;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Exo4ListeNbrPremier 
{
    static int[] listeNombresPremiers(int a)
    {
        int resultat[]= new int[a];
        int count=0, i = 2;
        
        while (count < a) 
        {            
            if (Exo1NbrPremier.estPremier(i)) 
            {
                resultat[count]=i;
                count++;
            }
            i++;
            
        }        
        return resultat;
    }
    public static void main(String[] args) 
    {
        System.out.println("Bonjour, nous allons lister dans un tableau de dimension n que l'on remplira avec des nombes qui sont premiers\n");
        System.out.println("n : ");
        int n = DemandeNbr.NbrEntier();
        int tab1[]= listeNombresPremiers(n);
        System.out.println("\nLe tableau de nombre premier de taille n est " + Arrays.toString(tab1));
    }
}
