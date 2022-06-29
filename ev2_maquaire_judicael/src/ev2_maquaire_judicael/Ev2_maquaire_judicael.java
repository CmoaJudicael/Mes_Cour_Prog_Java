/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2_maquaire_judicael;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ev2_maquaire_judicael 
{
    public static Scanner Sc = new Scanner(System.in);
    public static boolean verif = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        tableau_carre_nombre_premier(NbrEntier());
    }
    public static void tableau_carre_nombre_premier(int  n)
    {
        int[] tabCarreNombrePremier= new int[n];
        int count=1;
        System.out.println("combien de valeurs : "+n);
        for (int i = 0; i < n; i++) 
        {
            tabCarreNombrePremier[i]=FonctionPuissance(count, 2);
            System.out.println(count+" a pour carré "+tabCarreNombrePremier[i]); 
            count++;
        }
        for (int i = 0; i < n; i++) 
        {           
        }
    }
    public static int FonctionPuissance(int base, int exponent) 
    {
       int result = 1;
       for (int i = 0; i < exponent; i++) 
       {
           result = base * result;
       }
       return result;
   }
    public static int NbrEntier()
    {  
         verif=false;
        int nbr = 0; 
        while (!verif) 
        {     
             try 
            {            
                System.out.println("Veuillez entrer un nombre entier");
                nbr = Integer.parseInt(Sc.nextLine());   
                verif = true;
            } 
            catch (Exception e) 
            {
                System.out.println("Veuillez entrer un nombre entier, s'il vous plaît !!!");
                verif = false;          
            }            
        }       
        return nbr;
    }
}
