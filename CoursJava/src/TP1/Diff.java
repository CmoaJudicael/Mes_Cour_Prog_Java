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
public class Diff 
{
    public static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Calcul(NbrSec());
    }
    public static void Calcul(int x)
    {
        int y = x++;
        System.out.println("On fait l'opération de y = x++");
        System.out.println("y = " + y +"\nx = " + x);
        y = ++x;
        System.out.println("On fait maintenant l'opération de y = ++x");
        System.out.println("y = " + y +"\nx = " + x);
    }
    public static int NbrSec()
    {
        int nbr = 0; try 
        {            
         System.out.println("Veuillez entrez une valeur de x");
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
