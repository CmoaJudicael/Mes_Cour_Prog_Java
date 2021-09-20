/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Calcul_Temps {
    
    public static Scanner Sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        CalculTime(NbrSec());
        
    }
    
    public static void CalculTime(int x)
    {
        int heure = x/3600;
        int minute = (x - (heure * 3600))/60;
        int sec = x - (heure * 3600) - (minute * 60);
        System.out.println("Le resultat est : " + heure + ":" + minute + ":" + sec);
    }
    
    
    
     public static int NbrSec()
    {
        int nbr = 0; try 
        {            
         System.out.println("Veuillez entrer le nombre de seconde");
        nbr = Integer.parseInt(Sc.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre entier, s'il vous plaît !!!");
            NbrSec();            
        }
        return nbr;
        
    }
    
    
}
