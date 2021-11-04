/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class DemandeNbr {
    
    public static Scanner Sc = new Scanner(System.in);
    public static boolean verif = false;
    public static void main(String[] args) {
        
    }
     public static float NbrFloat()
    {
        float nbr = 0f;
        try 
        { 
         System.out.println("Veuillez entrer un nombre");
        nbr = Float.parseFloat(Sc.nextLine()); 
        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre, s'il vous plaît !!!");
            NbrFloat();            
        }
        return nbr;
    }
    
    public static int NbrEntier()
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
       
    public static String DemandeStr()
    {  
        String res = ""; 
        try 
        {            
         System.out.println("Veuillez entrer une phrase");
        res = Sc.nextLine();        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer une phrase, s'il vous plaît !!!");
            DemandeStr();            
        }
        return res;
    }
    public static int DemandRandomInt(int min, int max)
    {
        int res = (int)(Math.random() * (max - min) + min);
        return res;
    }
    public static float DemandRandomFloat(int min, int max)
    {
        float res = (float)(Math.random() * (max - min) + min);
        return res;
    }
       
 
    
}
