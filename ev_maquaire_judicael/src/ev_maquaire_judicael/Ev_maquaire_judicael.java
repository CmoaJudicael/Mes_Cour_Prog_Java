/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev_maquaire_judicael;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ev_maquaire_judicael 
{
    
    static int nbrAMultiplier = 1, resultat; 
    public static Scanner Sc = new Scanner(System.in);
    public static boolean verif = false;
    
    public static void main(String[] args) 
    {
        System.out.println("Bienvenue dans le programme de table de multiplication, pour les nombres entiers entre 1 et 10\n");
        while (nbrAMultiplier>0) 
        {
            
            nbrAMultiplier = NbrEntier();//Dans la variable nbrAMultiplier j'appelle la methode NbrEntier qui demande à l'utilisateur un nombre entier
        
            if (nbrAMultiplier>0 & nbrAMultiplier<=10) 
            {
                
                System.out.println("Table de " + nbrAMultiplier + " :");         
                for (int i = 1; i <= 10; i++) 
                {
                    resultat = nbrAMultiplier*i;
                    System.out.println("" + nbrAMultiplier + " x " + i + " = " + resultat);
                }               
            }
            else if(nbrAMultiplier>10)
            {
                System.out.println("\nDésolé, ceci n'est pas un nombre compris entre 1 et 10\n");
            }
            else
            {                
                System.out.println("\nMerci d'avoir utilisé notre programme\n");
            }
        }
        
        
    }
      public static int NbrEntier()//demande un nombre entier et le vérifie avant de le renvoyer
    {  
        verif=false;
        int nbr = 0; 
        while (!verif) 
        {     
             try 
            {            
                System.out.println("\nVeuillez entrer un nombre entier");
                nbr = Integer.parseInt(Sc.nextLine());   
                verif = true;
            } 
            catch (Exception e) 
            {
                System.out.println("\nVeuillez entrer un nombre entier, s'il vous plaît !!!");
                verif = false;          
            }            
        }
       
        return nbr;
    }
    
    
}
