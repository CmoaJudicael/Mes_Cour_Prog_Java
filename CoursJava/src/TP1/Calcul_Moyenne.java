/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;

import static TP1.Calcul_TVA.SC;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calcul_Moyenne 
{
    public static Scanner Sc = new Scanner(System.in);
    public static float sommeArt, resultatArt = 0;
        
    public static void main(String[] args) 
    {
        int Nbr = NbrArt();
        for (int i = 1; i <= Nbr; i++) 
        {
            sommeArt = PrixArt(i);
            resultatArt += sommeArt;
        }
       
        float resultatMoyenne = (resultatArt)/Nbr ;
        
        
        System.out.println("le resultat de la moyenne est de : " + resultatMoyenne);
    }
    public static int NbrArt()
    {
        int nbr = 0; try 
        {            
         System.out.println("Veuillez entrer le nombre d'article");
        nbr = Integer.parseInt(SC.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre entier, s'il vous plaît !!!");
            NbrArt();            
        }
        return nbr;
        
    }
    
    public static float PrixArt(int i)
    {
        float Px = 0f;
        try 
        {            
         System.out.println("Veuillez entrer le prix du "+ i + " article");
        Px = Float.parseFloat(Sc.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre, s'il vous plaît !!!");
            PrixArt(i);
        }
        return Px;
    }
    
    
}
