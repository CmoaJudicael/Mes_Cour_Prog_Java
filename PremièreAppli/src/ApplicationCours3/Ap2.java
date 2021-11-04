/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCours3;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Ap2 
{
    public static void main(String[] args) 
    {
        int matrice[][] = new int [3][5];//J'initialise la matrice1
        
        //j'affiche la matrice vide
        System.out.print("Matrice :\n");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("[");
            for (int j = 0; j < 5; j++) 
            {                
                System.out.print(matrice[i][j]);
                if (j!=4)
                {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        System.out.println("\n");
        
        //je remplie et j'affiche la matrice vide
        System.out.print("Matrice :\n");
        int n = 11;
        for (int i = 0; i < matrice.length; i++) 
        {
            System.out.print("[");
            for (int j = 0; j < matrice[0].length; j++) 
            {       
                matrice[i][j] = n;
                if (n==15) 
                {
                    n=21;
                }
                else if (n==25)
                {
                    n=31;
                }
                else
                {
                    n++;
                }                
                System.out.print(matrice[i][j]);
                if (j!=4)
                {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        System.out.println("\n");
        
        int matrice2[][] = {{1,2},{3,4}};//J'initialise la matrice2
        System.out.println("matrice2 :");
        System.out.println(Arrays.toString(matrice2[0]));
        System.out.println(Arrays.toString(matrice2[1]));
        
    }
    
}
