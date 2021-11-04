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
public class Exo6Tableur 
{
    static int[][] remplirTableau(int lignes, int colonnes)
    {
        int[][] tabResultat= new int[(lignes+1)][(colonnes+1)];
        for (int i = 0; i < lignes; i++) 
        {
            for (int j = 0; j < colonnes; j++) 
            {
                tabResultat[i][j]=(int)(Math.random()*10);
            }            
        }
        return  tabResultat;
        
    }
    static int [][] tableurSommeLignesColonnes(int [][] tabA)
    { 
        int[][] tabResultat= tabA;
        for (int i = 0; i < (tabA.length-1); i++) 
        {
            for (int j = 0;  j < (tabA[i].length); j++) 
            {
                if (j!=(tabA[i].length-1)) 
                {
                    tabA[i][(tabA[i].length-1)]+=tabA[i][j];                    
                }
                tabA[(tabA.length-1)][j]+=tabA[i][j];
            }            
        }
        return  tabResultat;
    }
    
    public static void main(String[] args) 
    {
        int lignes=0, colonnes=0;
        System.out.println("Bonjour, nous allons commencer par éditer et remplir un tableau de manière dynamique, puis faire la somme de chaque lignes et colonnes\ndans une nouvelles lignes et colonnes");
        System.out.println("Combien de ligne souhaitez vous avoir? vous ne pouvez pas choissir zéro");
        while (lignes<=0) 
        {            
            lignes = DemandeNbr.NbrEntier();
        }
        System.out.println("Combien de colonnes souhaitez vous avoir? vous ne pouvez pas choissir zéro");
        while (colonnes<=0) 
        {
            colonnes = DemandeNbr.NbrEntier();
        }
        int [][] monTableau = remplirTableau(lignes, colonnes);
        System.out.println("\nNotre tableau :");
        for (int i = 0; i < monTableau.length; i++) 
        {
            System.out.println(Arrays.toString(monTableau[i]));
        }
        monTableau = tableurSommeLignesColonnes(monTableau);
        
        System.out.println("\nNotre tableau après la somme des colonnes :");
        for (int i = 0; i < monTableau.length; i++) 
        {
            System.out.println(Arrays.toString(monTableau[i]));
        }
        
    }
}
