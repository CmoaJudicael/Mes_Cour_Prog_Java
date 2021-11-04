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
public class Exo5TabSimpleDim 
{
    public static int sommeTableau(int [] tabA)
    {
        int resultat = 0;
        for (int i = 0; i < tabA.length; i++) 
        {
            resultat+=tabA[i];
        }
        return resultat;
    }
    
    public static void main(String[] args) 
    {
        
        System.out.println("Bonjour, nous allons faire la somme des nombres contenue dans un tableau\n");
        System.out.println("Créons d'abord notre tableau, choississons sa dimension");
        int[] monTableau = new int[DemandeNbr.NbrEntier()];
        System.out.println("Remplissons-le ^^");
        for (int i = 0; i < monTableau.length; i++) 
        {
            monTableau[i] = DemandeNbr.NbrEntier();
        }
        System.out.println("Voici notre tableau " + Arrays.toString(monTableau));
        System.out.println("La somme des nombres dans notre tableau est de " + sommeTableau(monTableau));
    }
}
