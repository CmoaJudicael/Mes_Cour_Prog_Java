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
        int nbr = 0; 
        try 
        {            
         System.out.println("Veuillez entrer un nombre entier");
        nbr = Integer.parseInt(Sc.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre entier, s'il vous plaît !!!");
            NbrEntier();            
        }
        return nbr;
    }
       
 
    
}
